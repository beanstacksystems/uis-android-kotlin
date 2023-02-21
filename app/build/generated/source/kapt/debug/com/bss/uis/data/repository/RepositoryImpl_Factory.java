// Generated by Dagger (https://dagger.dev).
package com.bss.uis.data.repository;

import com.bss.uis.data.remote.ApiInterFace;
import com.bss.uis.data.remote.PincodeInterface;
import com.bss.uis.mapper.AuthResponseDomainMapper;
import com.bss.uis.mapper.MasterDomainResponseMapper;
import com.bss.uis.mapper.TabResponseDomainMapper;
import com.bss.uis.mapper.UserApiResponseDomainMapper;
import com.bss.uis.mapper.UserRightsDomainMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryImpl_Factory implements Factory<RepositoryImpl> {
  private final Provider<ApiInterFace> apiInterFaceProvider;

  private final Provider<PincodeInterface> pincodeInterfaceProvider;

  private final Provider<AuthResponseDomainMapper> authResponseDomainMapperProvider;

  private final Provider<MasterDomainResponseMapper> masterDataResponseDomainMaperProvider;

  private final Provider<TabResponseDomainMapper> tabResponseDomainMapperProvider;

  private final Provider<UserApiResponseDomainMapper> userApiResponseDomainMapperProvider;

  private final Provider<UserRightsDomainMapper> userRightsDomainMapperProvider;

  public RepositoryImpl_Factory(Provider<ApiInterFace> apiInterFaceProvider,
      Provider<PincodeInterface> pincodeInterfaceProvider,
      Provider<AuthResponseDomainMapper> authResponseDomainMapperProvider,
      Provider<MasterDomainResponseMapper> masterDataResponseDomainMaperProvider,
      Provider<TabResponseDomainMapper> tabResponseDomainMapperProvider,
      Provider<UserApiResponseDomainMapper> userApiResponseDomainMapperProvider,
      Provider<UserRightsDomainMapper> userRightsDomainMapperProvider) {
    this.apiInterFaceProvider = apiInterFaceProvider;
    this.pincodeInterfaceProvider = pincodeInterfaceProvider;
    this.authResponseDomainMapperProvider = authResponseDomainMapperProvider;
    this.masterDataResponseDomainMaperProvider = masterDataResponseDomainMaperProvider;
    this.tabResponseDomainMapperProvider = tabResponseDomainMapperProvider;
    this.userApiResponseDomainMapperProvider = userApiResponseDomainMapperProvider;
    this.userRightsDomainMapperProvider = userRightsDomainMapperProvider;
  }

  @Override
  public RepositoryImpl get() {
    return newInstance(apiInterFaceProvider.get(), pincodeInterfaceProvider.get(), authResponseDomainMapperProvider.get(), masterDataResponseDomainMaperProvider.get(), tabResponseDomainMapperProvider.get(), userApiResponseDomainMapperProvider.get(), userRightsDomainMapperProvider.get());
  }

  public static RepositoryImpl_Factory create(Provider<ApiInterFace> apiInterFaceProvider,
      Provider<PincodeInterface> pincodeInterfaceProvider,
      Provider<AuthResponseDomainMapper> authResponseDomainMapperProvider,
      Provider<MasterDomainResponseMapper> masterDataResponseDomainMaperProvider,
      Provider<TabResponseDomainMapper> tabResponseDomainMapperProvider,
      Provider<UserApiResponseDomainMapper> userApiResponseDomainMapperProvider,
      Provider<UserRightsDomainMapper> userRightsDomainMapperProvider) {
    return new RepositoryImpl_Factory(apiInterFaceProvider, pincodeInterfaceProvider, authResponseDomainMapperProvider, masterDataResponseDomainMaperProvider, tabResponseDomainMapperProvider, userApiResponseDomainMapperProvider, userRightsDomainMapperProvider);
  }

  public static RepositoryImpl newInstance(ApiInterFace apiInterFace,
      PincodeInterface pincodeInterface, AuthResponseDomainMapper authResponseDomainMapper,
      MasterDomainResponseMapper masterDataResponseDomainMaper,
      TabResponseDomainMapper tabResponseDomainMapper,
      UserApiResponseDomainMapper userApiResponseDomainMapper,
      UserRightsDomainMapper userRightsDomainMapper) {
    return new RepositoryImpl(apiInterFace, pincodeInterface, authResponseDomainMapper, masterDataResponseDomainMaper, tabResponseDomainMapper, userApiResponseDomainMapper, userRightsDomainMapper);
  }
}
