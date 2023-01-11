import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable
import net.rcarz.jiraclient.BasicCredentials
import net.rcarz.jiraclient.JiraClient
import net.rcarz.jiraclient.JiraException
import net.rcarz.jiraclient.Field
import net.rcarz.jiraclient.Issue
import net.rcarz.jiraclient.Issue.FluentCreate
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.logging.LogLevel
import com.kms.katalon.core.logging.model.TestStepLogRecord
import com.kms.katalon.core.logging.model.TestSuiteLogRecord
import com.kms.katalon.core.main.TestCaseExecutor
import com.kms.katalon.core.configuration.RunConfiguration
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestResult
import com.kms.katalon.core.logging.model.ILogRecord
import com.kms.katalon.core.logging.model.TestCaseLogRecord

class JiraAutomaticBugReporting {
	@AfterTestCase
	def JiraBugs(TestCaseContext testCaseContext, TestCase testcase) throws JiraException {
		println testCaseContext.getTestCaseId()
		String Status = testCaseContext.getTestCaseStatus()
		
		println RunConfiguration.getLogFolderPath()
		println testCaseContext.getTestCaseVariables()
		println Status
		String testString = testCaseContext.getTestCaseId()
		String[] parts = testString.split("/");
		String testCaseName = parts[parts.length - 1]
		String a = "FAILED"
		if(Status == a) {
			println "Failed"
			println "***********************************************************"
	
			String desc = RunConfiguration.getExecutionSourceDescription()
			BasicCredentials creds = new BasicCredentials("nofoxo7854@lidely.com","fXtOhjozaeL0AY53JUEB10B9")
			JiraClient jira = new JiraClient("https://nofoxo.atlassian.net/", creds)
			
			Issue.SearchResult allTheIssue = jira.searchIssues("project = KAT AND summary ~ "+testCaseName+" AND issuetype = KatalonTestCase order by created DESC", 1000);
			for (Issue issueID : allTheIssue.issues) {
							 
			Issue issueName = jira.createIssue("KAT","Bug").field(Field.SUMMARY, testCaseName.toString()).field(Field.DESCRIPTION, "Please search related issue :  "+issueID.getKey()+ " for more information").field(Field.ASSIGNEE, "nofoxo").execute()
			//Issue issueName = jira.createIssue("KAT","Bug").field(Field.SUMMARY, testCaseName.toString()).field(Field.DESCRIPTION, "Please search issue related to key "+issueID+ "here" + '\n' + desc.toString()).field(Field.ASSIGNEE, "nofoxo".toString()).execute()
			
			println "issue is created with issue key " + issueName.getKey()		
			}	
	}}}