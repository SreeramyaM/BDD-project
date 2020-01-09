package Utility;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.testng.Assert;

public class FileDownloaded {

	public FileDownloaded() throws Exception {

	}

	private static final Logger logger = LogManager.getLogger(FileDownloaded.class.getName());
	ReadPropertyFiles readPropertyFiles = new ReadPropertyFiles();

	public boolean verifyisFileDownloaed(String downloadPath,String filepath) {

	    File getLatestFile = getLatestFilefromDir(downloadPath);
	    String fileName = getLatestFile.getName();
	    Assert.assertTrue(fileName.equals(filepath),
	        "Downloaded file \r\n" + "   name is not matching with expected file name");
	    return false;

	  }

	public boolean deleteExistingFile(String downloadPath) {
		try {
			File f = new File(downloadPath);
			if (f.delete())
				logger.info("Existing file deleted");
		} catch (Exception e) {
			logger.info("Existing file Not deleted");
		}
		return false;
	}

	public File getLatestFilefromDir(String dirPath) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}

		File lastModifiedFile = files[0];
		for (int i = 1; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;
	}

	public boolean verifyPassswordProtected(String filepath) throws Exception {
		boolean encrypted = false;

		File f = new File(filepath);
		FileInputStream fs = new FileInputStream(f);
		byte[] inputBytes = IOUtils.toByteArray(fs);
		try {
			PDDocument pdfDocument = PDDocument.load(new ByteArrayInputStream(inputBytes));
			if (pdfDocument.isEncrypted()) {
				encrypted = true;
				pdfDocument.close();
			}
		} catch (InvalidPasswordException e) {
			logger.error("error found " + e.getMessage());
			encrypted = false;
		}
		return encrypted;
	}

}