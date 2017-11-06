package com.balatamilmani.elasticclient.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.balatamilmani.elasticclient.model.MemberPostMessage;

public interface MemberPostMessageRepository extends ElasticsearchRepository<MemberPostMessage, String>{

}
