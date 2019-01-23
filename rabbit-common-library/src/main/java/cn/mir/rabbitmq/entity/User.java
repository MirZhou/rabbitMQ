package cn.mir.rabbitmq.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 实体：用户
 * <p>Create time: 1/23/2019 3:31 PM</p>
 *
 * @author 周光兵
 **/
@Getter
@Setter
@ToString
public class User implements Serializable {
    /**
     * 姓名
     */
    private String name;
    /**
     * 备注
     */
    private String remark;
}