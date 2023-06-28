package DTO;

public class FilesDTO {
    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getFilePath() {
        return FilePath;
    }

    public void setFilePath(String filePath) {
        FilePath = filePath;
    }

    public Integer getFileNumberMapping() {
        return FileNumberMapping;
    }

    public void setFileNumberMapping(Integer fileNumberMapping) {
        FileNumberMapping = fileNumberMapping;
    }

    public String FileName;
    public String FilePath;
    public Integer FileNumberMapping;

}
