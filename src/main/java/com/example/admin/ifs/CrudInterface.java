package com.example.admin.ifs;

import com.example.admin.model.network.Header;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CrudInterface<Req,Res> {

    Header<Res> create(Header<Req> request);    // todo request object 추가

    Header<Res> read(Long id);

    Header<Res> update(Header<Req> request);

    Header delete(Long id);
}
