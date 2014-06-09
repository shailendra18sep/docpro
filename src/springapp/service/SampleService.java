package springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springapp.domain.Sample;
import springapp.repository.SampleMapper;

@Service
public class SampleService {
	@Autowired
	private SampleMapper sampleMapper;

	public Sample getSample(String username) {
		return sampleMapper.getSampleByName(username);
	}

}
