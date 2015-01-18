package kata5;

import java.io.File;

public class FileMailLoader implements MailLoader{

    private File file;

    public FileMailLoader(File file) {
        this.file = file;
    }
    
    @Override
    public Mail[] load() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
