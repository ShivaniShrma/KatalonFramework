package commonKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.configuration.RunConfiguration

import internal.GlobalVariable
import java.nio.file.Files
import java.nio.file.Paths
import org.json.JSONObject
import org.json.XML
import com.kms.katalon.core.util.KeywordUtil
class XmlToJson {



	@Keyword

	def convertXmltoJson(String xmlFilePath) {

		try {

			StringBuilder sb = new StringBuilder();

			BufferedReader br = Files.newBufferedReader(Paths.get(xmlFilePath))

			// read line by line

			String line;

			while ((line = br.readLine()) != null)

				sb.append(line).append("\n")

			println(sb)



			String xml = (sb);

			JSONObject json = XML.toJSONObject(xml);

			String jsonPrettyPrintString = json.toString(4);

			println(jsonPrettyPrintString);

			FileWriter file = new FileWriter(RunConfiguration.getProjectDir() + "/JSONFile/OutputJson.txt")
			file.write(jsonPrettyPrintString)
			file.close()


		} catch (Exception e) {

			KeywordUtil.markFailed(e.getMessage())
		}
	}
}