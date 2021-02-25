package com.redhat.examples.fuse.service;

import com.ibm.coh.ApplicantAndApplication;
import com.ibm.coh.avustus.data.GrantApplicationDTO;
import com.redhat.examples.fuse.model.Order;
import com.redhat.examples.fuse.model.OrderRequest;
import com.redhat.examples.fuse.model.Product;

public interface DtoTransformerService {

	ApplicantAndApplication transform(OrderRequest orderRequest);

}
