package com.bss.uis.helper

import android.content.Context
import com.bss.uis.roomdb.UISDatabase
import com.bss.uis.roomdb.dao.repository.MasterDaoRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


fun getListOfDataType(
    dataType: String,
    pairs: MutableList<Pair<String, String>>,
    context: Context
) {
    CoroutineScope(Dispatchers.IO).launch {
        val masterdao = UISDatabase.getInstance(context).masterDAO
        val masterDaoRepository = MasterDaoRepository(masterdao)
        masterDaoRepository.masterDataList.forEach { data ->
            if (data.masterdataType!! == dataType) {
                val pair = Pair(data.masterdataId.toString(), data.masterdatadesc.toString())
                pairs.add(pair)
            }
        }
    }
}