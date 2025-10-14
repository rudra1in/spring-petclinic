package org.springframework.samples.petclinic.vet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacultyMgmtController {

	@GetMapping("/faculties/hello")
	public ResponseEntity<String> helloFaculty() {
		return ResponseEntity.ok("hello");

	}

	@GetMapping("/faculties/sessions")
	public ResponseEntity<SubjectSessions> helloSessions() {
		SubjectSessions facultySession = new SubjectSessions();
		facultySession.setSubjectName("Rudra");
		return ResponseEntity.ok().body(facultySession);

	}

}
