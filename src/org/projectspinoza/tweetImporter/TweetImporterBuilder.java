/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projectspinoza.tweetImporter;

import org.gephi.io.importer.api.FileType;
import org.gephi.io.importer.spi.FileImporter;
import org.gephi.io.importer.spi.FileImporterBuilder;
import org.openide.filesystems.FileObject;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Muhammad
 */
@ServiceProvider(service = FileImporterBuilder.class)
public class TweetImporterBuilder implements FileImporterBuilder {
    
    @Override
    public FileImporter buildImporter() {
        return new TweetImporter();
    }
    @Override
    public FileType[] getFileTypes() {
        return new FileType[]{new FileType(".tweet", "Tweet files, containing one Twitter tweet per line")};
    }
    @Override
    public boolean isMatchingImporter(FileObject fo) {
        return fo.getExt().equalsIgnoreCase("tweet");
    }
    @Override
    public String getName() {
        return "tweet";
    }
}
