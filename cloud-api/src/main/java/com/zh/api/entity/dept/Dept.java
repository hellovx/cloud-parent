package com.zh.api.entity.dept;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Accessors(chain = true)
@Getter
@Setter
public class Dept implements Serializable {

	private Integer id;
	private String name;

}
