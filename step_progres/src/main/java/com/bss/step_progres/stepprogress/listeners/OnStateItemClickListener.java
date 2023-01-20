package com.bss.step_progres.stepprogress.listeners;



import com.bss.step_progres.stepprogress.StepProgressBar;
import com.bss.step_progres.stepprogress.components.StateItem;

public interface OnStateItemClickListener {

    void onStateItemClick(StepProgressBar stepProgressBar, StateItem stateItem, int stateNumber, boolean isCurrentState);

}
