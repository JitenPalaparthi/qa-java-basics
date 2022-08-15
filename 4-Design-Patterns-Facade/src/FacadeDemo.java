import java.io.File;

public class FacadeDemo {

	public static void main(String[] args) {
	
		var c1= new VideoConverterFacade();
		c1.convert("abcd.mix","ogg");
		c1.convert("abcd.mix","codec");

	}

}

class BaseForamt {
	protected String filename;

	public BaseForamt(String filename) {
		this.filename = filename;
	}
	
	public void convert() {
		System.out.println("Base format converter");
	}
}

class VideoFile extends BaseForamt {
	public VideoFile(String name) {
		super(name);
	}
	@Override
	public void convert() {
		System.out.println(this.filename+" Convert using VideoFile converter");
	}
}

class OggCompressionCodec extends BaseForamt {
	public OggCompressionCodec(String name) {
		super(name);
	}
	@Override
	public void convert() {
		System.out.println(this.filename+" Convert using OggCompressionCodec converter");
	}
}

class MPEG4CompressionCodec extends BaseForamt {
	public MPEG4CompressionCodec(String name) {
		super(name);
	}
	@Override
	public void convert() {
		System.out.println(this.filename+" Convert using MPEG4CompressionCodec converter");
	}
}

class CodecFactory extends BaseForamt {
	public CodecFactory(String name) {
		super(name);
	}
	@Override
	public void convert() {
		System.out.println(this.filename+" Convert using CodecFactory converter");
	}
}

class BitrateReader extends BaseForamt {
	public BitrateReader(String name) {
		super(name);
	}
	@Override
	public void convert() {
		System.out.println(this.filename+" Convert using BitrateReader converter");
	}
}

class AudioMixer extends BaseForamt {
	public AudioMixer(String name) {
		super(name);
	}
	@Override
	public void convert() {
		System.out.println(this.filename+" Convert using AudioMixer converter");
	}
}

// complex classes

class VideoConverterFacade {
	public void convert(String filename, String format) {
		if (format == "video") {
			 new VideoFile(filename).convert();
		} else if (format == "ogg") {
			 new OggCompressionCodec(filename).convert();
		} else if (format == "mpeg4") {
			 new MPEG4CompressionCodec(filename).convert();
		} else if (format == "codec") {
			 new CodecFactory(filename).convert();
		} else if (format == "bitrate") {
			 new BitrateReader(filename).convert();
		} else if (format == "audiomixer") {
			 new AudioMixer(filename).convert();
		} else {
			 new BaseForamt(filename).convert();
		}
	}
}
