package com.springmongo.App;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRespository extends MongoRepository<DetailInfo,String> {
}
