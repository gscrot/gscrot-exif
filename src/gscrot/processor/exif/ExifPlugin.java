package gscrot.processor.exif;

import com.redpois0n.gscrot.ImageProcessor;

import gscrot.api.Plugin;

public class ExifPlugin extends Plugin {

	public ExifPlugin() {
		super("EXIF");
		ImageProcessor.addBinaryProcessor(new EXIFProcessor());
	}

}
