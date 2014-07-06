
Exercise 7
==========

Don't Panic :-)<br/>
This is a long exercise but broken into steps...

This project is a continuation of exercise 6.<br/>
The following classes were added:
  - **MemberController**: handles REST APIs for members
  - **MemberControllerTest** is a JUnit test of **MemberController** (test directory, inside controller package)
  - **MemberControllerRemoteTest** is a remote (system) test of **MemberController** (test directory, inside controller/remote package)

1. Complete the **MemberController** APIs (all the TODOs in the file)
  - *loanBook*
  - *readAllLoanedBooks*
  - *returnBook*

2. Open **MemberControllerTest** and implement the following tests (TODOs in the code)
  - *testLoanBook* (include verification that correct service is called)
  - *testReadAllLoanedBooks* (include verification that correct service is called)<br/>
   (all of the tests of this class should pass **EXCEPT** for *testCreateInvalidMembership*)

3. Add validations to beans
  - Book validations:
      - **Name** must not be null and size not bigger than 50 characters
      - **Author** must not be null and size not bigger than 50 characters
  - Member validations:
      - **FirstName** must not be null and not blank
      - **Email**, if exist, must be in a valid email format<br/>
  Add validations to:
  - **LibraryController.createBook** method
  - **MemberController.createMembership** method

4. Create a class to handle ALL of the exceptions of ALL of the controllers<br/>
   ALL exception handlers MUST return an **Error** pojo (located inside controller/exception directory)<br/>
   Add specific error handling for the following exceptions:
    - IllegalArgumentException          (Error should **contain** return-code Error.Code.INVALID_INPUT)
    - IllegalStateException             (Error should **contain** return-code Error.Code.INVALID_STATE)
    - MethodArgumentNotValidException   (Error should **contain** return-code Error.Code.INVALID_INPUT)
    - Exception                         (Error should **contain** return-code Error.Code.UNKNOWN_ERROR)

5. Open **LibraryControllerTest** and make sure the following tests PASS successfully:
  - *testDeleteBook*
  - *testCreateInvalidBook*

6. Open **LibraryControllerRemoteTest** and make sure that all tests PASS successfully.<br/>
    **NOTICE**
  - Make sure to comment out the *'@Ignore'* above the tests in order them to run.
  - You should have a tomcat running in order to run the test, make sure the "baseUrl" is configured to your tomcat host:port

7. Open **MemberControllerRemoteTest** and implement following methods (TODOs in the code)
  - *readLoanedBooks*
  - *loanBook*
  - *returnBook*<br/>
 Make sure that all tests pass successfully<br/>
 **NOTICE**
  - Make sure to comment out the *'@Ignore'* above the tests in order them to run.
  - You should have a tomcat running in order to run the test, make sure the "baseUrl" is configured to your tomcat port

8. Add Message Converter to the book model,<br/>
   modify the book model so that the book **"name"** field will be converted to **"title"** (for JSON only)
    - Check that the LibraryControllerTest.testBookNameChangedToTitle passes successfully
    - The **LibraryControllerTest.testCreateBook** is now broken, fix it
<br/><br/>**RESTART TOMCAT**
9. In general, all test classes should be completed and successfully run (both JUnit tests and remote tests)

###N O T I C E
- [ ] DO NOT EDIT any of the files in the directories: dao, service, util, application
- [ ] \(or in other words\) ONLY EDIT the files in the controller and model packages
- [ ] In remote tests, make sure you comment out the @Ignore in order for the test to run
- [ ] In remote tests, make sure the "baseUrl" is configured to your tomcat host:port (the current default is http://localhost:8080/)
