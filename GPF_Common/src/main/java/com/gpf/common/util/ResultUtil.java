package com.gpf.common.util;

import com.gpf.common.result.R;

public class ResultUtil {
    public static R createResult(int res){
        if (res>0){
            return R.setOK();
        }else {
            return R.setERROR();
        }
    }
}
