package com.xdl.mapper;

import org.apache.ibatis.annotations.Param;

import com.xdl.bean.XdlBankAccount;

public interface XdlBankAccountDAO {
     XdlBankAccount   findAccountByAccNoAndAccPassword(
    	 @Param("acc_no")String  acc_no,
    	 @Param("acc_password")String acc_password);
}
