package com.balatamilmani.elasticclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class ElasticclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticclientApplication.class,"--debug");
	}
}
