package com.kh.spring.member.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * Lombok
 * 	- 자동 코드 생성 라이브러리
 * 	- 반복되는 getter, setter, toString 등의 메소드를 자동 생성
 * 설치 방법
 * 	1. 라이브러리 다운로드 후 적용(pom.xml)
 * 	2. 다운받은 jar 파일 찾아 설치(사용하는 ide 에 설치해야 함)(cmd)
 * 	3. ide 재실행
 * 유의점
 * 	- camelCase 시 앞에 외자가 있으면 오류 가능성 ex)userId -> uId
 * 
 */


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Member {
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private String gender;
	private String age;
	private String phone;
	private String address;
	private Date enrollDate;
	private Date modifyDate;
	private String status;
}
