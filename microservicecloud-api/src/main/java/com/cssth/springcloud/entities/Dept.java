package com.cssth.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept implements Serializable{
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;

    public Dept(String dname){
        this.dname = dname;
    }

}
