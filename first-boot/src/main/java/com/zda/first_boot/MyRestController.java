package com.zda.first_boot;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person getPerson(@PathVariable Integer id) {
		Person p = new Person();
		p.setId(id);
		p.setName("angus");
		p.setAge("30");
		return p;
	}
	@RequestMapping(value = "/person/create", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public Person createPerson(@RequestBody Person p) {
		System.out.println("success");
		return p;
	}
	@RequestMapping(value = "/person/createall", method = RequestMethod.POST)
	public String createallPerson(@RequestBody List<Person> list) {
		list.forEach(a->{
			System.out.println(a.getName()+"---age"+a.getAge());
		});
		System.out.println("success"+list.size());
		return "返回成功,添加个数："+list.size();
	}
}
