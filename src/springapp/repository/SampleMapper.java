package springapp.repository;

import springapp.domain.Sample;

//Creates CRUD operations for Sample Table
public interface SampleMapper {
	void insertIntoSample(Sample sample);

	Sample getSampleByName(String username);

	void updateSample(Sample sample);

	void removeSample(Sample sample);

}
