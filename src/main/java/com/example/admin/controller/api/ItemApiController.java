package com.example.admin.controller.api;

import com.example.admin.controller.CrudController;
import com.example.admin.ifs.CrudInterface;
import com.example.admin.model.entity.Item;
import com.example.admin.model.network.Header;
import com.example.admin.model.network.request.ItemApiRequest;
import com.example.admin.model.network.response.ItemApiResponse;
import com.example.admin.service.ItemApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/item")
public class ItemApiController extends CrudController<ItemApiRequest, ItemApiResponse, Item> {


}
