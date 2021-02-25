package com.redhat.examples.fuse.builder;

import com.tieto.p8.subvention.filenet.service.Subvention;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service("subventionRequestBuilder")
public class SubventionRequestBuilder {

	public ArrayList<Object> createSubvention(String application) {
		Subvention subvention = new Subvention();
		subvention.setApplicantAndApplicationXml(application);
		subvention.setAttachmentDescription(null);
		subvention.setAttachmentFileName(null);
		subvention.setAttachmentFiletype(null);
		
		//Find CaseID
		Pattern pattern = Pattern.compile("&lt;CaseID>([a-zA-Z0-9-]*)", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(application);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      subvention.setCaseID(matcher.group().replace("&lt;CaseID>", ""));
	    } else {
	      System.out.println("Match not found");
	    }
		
		ArrayList<Object> result = new ArrayList<Object>();
		result.add(subvention);
		byte[] koe = "koe".getBytes();
		result.add(koe);
		return result;
		
	}
	
}
