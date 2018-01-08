package jacksonpradolima.csv2bib.exporter.springer;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import me.tongfei.progressbar.ProgressBar;

/**
 * Wrapper to get RIS informations from URLs
 * 
 * @author Fernando Godóy <fernandogodoy18@gmail.com>
 *
 */
public class SpringerRis implements SpringerExporter {

	private String outputFile;
	private List<String> urls;

	public SpringerRis(String outputFile, List<String> urls) {
		this.outputFile = outputFile;
		this.urls = urls;
	}

	@Override
	public Path getOutputFile() {
		return Paths.get(outputFile);
	}
	
	@Override
	public List<String> getUrls() {
		return urls;
	}

	@Override
	public void message(ProgressBar pb) {
		pb.setExtraMessage("Getting RIS informations...");
	}

}
