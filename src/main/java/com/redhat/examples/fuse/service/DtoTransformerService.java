package com.redhat.examples.fuse.service;

import com.ibm.coh.ApplicantAndApplication;
import com.redhat.examples.fuse.model.SubventionRequest;

public interface DtoTransformerService {

	ApplicantAndApplication transform(SubventionRequest orderRequest);

}
