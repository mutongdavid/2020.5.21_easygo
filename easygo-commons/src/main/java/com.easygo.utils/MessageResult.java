package com.easygo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description:描述
 * author:mutong(david)
 * time:15:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageResult {
    private  Integer code;
    private  String message;
}
