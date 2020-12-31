package com.app.service.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.app.exception.BusinessException;
import com.app.service.OwnerSearchService;
import com.app.service.impl.OwnerSearchServiceImpl;

class OwnerSearchServiceImplTest {

	@BeforeAll
	static void setupOwnerSearchServiceImpl() {
		OwnerSearchService ossi = new OwnerSearchServiceImpl();
	}
	
	
	/*@Test
	void testGetOwnerByIdForBusinessException() { //For BusinessException
		Executable executable = new Executable() {

			@Override
			public void execute() throws Throwable {
				setupOwnerSearchServiceImpl();
				
			}
			
		};
		assertThrows(BusinessException.class, executable);
	} */

	@Test
	void testGetOwnerByContact() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllOwners() {
		fail("Not yet implemented");
	}

	@Test
	void testGetOwnersByAge() {
		fail("Not yet implemented");
	}

	@Test
	void testGetOwnersByGender() {
		fail("Not yet implemented");
	}

	@Test
	void testGetOwnersByDogId() {
		fail("Not yet implemented");
	}

	@Test
	void testGetOwnersByName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetOwnersByDob() {
		fail("Not yet implemented");
	}

}
