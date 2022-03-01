package com.infosys.stream.casestudy;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

	public static void main(String[] args) {
	
		//list candidate names from Pune city
		System.out.println("List of Pune Candidates:");
		List<Candidate> puneCandidates = InterviewRepository.getCandidateList().stream().filter((candidate)->candidate.getCity().equals("Pune")).collect(Collectors.toList());
		puneCandidates.forEach(System.out::println);
		printLine();
		//list city and count of candidates per city
		System.out.println("Candidate count per city");
		Map<String,List<Candidate>> cityCount = InterviewRepository.getCandidateList().stream().collect(Collectors.groupingBy((student)->student.getCity()));
		System.out.println( cityCount);
		for(String city:cityCount.keySet()) {
			System.out.println(city+":"+cityCount.get(city).size());
		}
		printLine();
		//list technical expertise and count of candidates
		System.out.println("Candidate count by Technical Expertise");
		Map<String,List<Candidate>> techCount = InterviewRepository.getCandidateList().stream().collect(Collectors.groupingBy(Candidate::getTechnicalExpertise));
		for(String techSubject:techCount.keySet()) {
			System.out.println(techSubject+":"+techCount.get(techSubject).size());
		}
		printLine();
		//list fresher candidates
		System.out.println("Fresher Candidate list");
		List<Candidate> freshers = InterviewRepository.getCandidateList().stream().filter((candidate)->candidate.getYearsOfExperience()==0).collect(Collectors.toList());
		freshers.forEach(System.out::println);
		printLine();
		//listing candidates with highest experience
		//first find out the highest years of experience value
		Integer maxYear = InterviewRepository.getCandidateList().stream().map((candidate)->candidate.getYearsOfExperience()).max(Integer::compare).get();
		List<Candidate> seniors = InterviewRepository.getCandidateList().stream().filter((candidate)->candidate.getYearsOfExperience()==maxYear).collect(Collectors.toList());
		System.out.println("Candidates having maximum experience");
		seniors.forEach(System.out::println);
		
		//sort the candidates by their years of experience
		printLine();
		System.out.println("Sorted List of Candidates by Experience");
		//create a comparable lambda which we will use for sorting
		Comparator<Candidate> yearComparator = (cand1,cand2)->cand1.getYearsOfExperience()-cand2.getYearsOfExperience();
		//pass the comparator in sorted() method of stream
		InterviewRepository.getCandidateList().stream().sorted(yearComparator).forEach(System.out::println);
		
		
		System.out.println("Sorted List of Candidates by tech ");
		
		Comparator<Candidate> technicalExpertice = (cand1,cand2)->cand1.getTechnicalExpertise().compareTo(cand2.getTechnicalExpertise());
		//pass the comparator in sorted() method of stream
		InterviewRepository.getCandidateList().stream().sorted(technicalExpertice).forEach(System.out::println);
	
		
		//sort the candidates by city name
		printLine();
		System.out.println("Sorted List of Candidates by City Name");
		//create a comparable lambda which we will use for sorting
		Comparator<Candidate> cityComparator = (cand1,cand2)->cand1.getCity().compareTo(cand2.getCity());
		//pass the comparator in sorted() method of stream
		InterviewRepository.getCandidateList().stream().sorted(cityComparator).forEach(System.out::println);
				
	}

	private static void printLine() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
	}
}
