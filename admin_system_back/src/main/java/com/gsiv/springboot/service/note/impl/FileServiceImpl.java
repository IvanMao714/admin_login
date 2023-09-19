package com.gsiv.springboot.service.note.impl;

import com.gsiv.springboot.domin.exception.PromptException;
import com.gsiv.springboot.service.note.FileService;
import com.gsiv.springboot.utils.FileUtil;
import com.gsiv.springboot.utils.ThreadLocalUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @projectName: admin_system_back
 * @package: com.gsiv.springboot.service.note.impl
 * @className: FileServiceImpl
 * @author: 65151
 * @description: TODO
 * @date: 2023-09-04 19:37
 * @version: 1.0
 */
//@Service
//@Slf4j
//public class FileServiceImpl implements FileService {
//
//    @Value("${fileDir}")
//    private String filePath;
//
//    private final String DIR_PREFIX = "/file/";
//
//    @Override
//    public String upload(MultipartFile sourceFile) {
//
//        File targetFile = uploadFile(sourceFile);
//
//        return DIR_PREFIX + getUsername() + "/" + targetFile.getName();
//    }
//
//    @Override
//    public File uploadFile(MultipartFile sourceFile) {
//        String filename = sourceFile.getOriginalFilename();
//
//        //获取扩展名
//        String fileExtensionName = filename.substring(filename.indexOf(".")+1);
//        //防止可能上传同样文件名的文件 TODO
//        String uploadFileName = UUID.randomUUID().toString()+"."+fileExtensionName;
//        File userDir  = getOrInitUserFileDirectory();
//        File targetFile = new File(userDir, uploadFileName);
//
//        //上传文件
//        try {
//            sourceFile.transferTo(targetFile);
//        } catch (IOException e) {
//            throw new RuntimeException("upload file failed");
//        }
//
//        return targetFile;
//    }
//
//    @Override
//    public boolean writeStringToFile(String content, File targetFile){
//        return FileUtil.writeStringToFile(content, targetFile);
//    }
//
//    @Override
//    public File createTmpEmptyDir() {
//        return null;
//    }
//
//    @Override
//    public String getContentFromFile(File file){
//        return FileUtil.readFileAsString(file);
//    }
//
//    @Override
//    public void deleteFile(File file){
//        FileUtil.deleteFileOrDirectory(file);
//    }
//
////    @Override
////    public void batchDelete(List<String> fileNames) {
////        fileNames.forEach(fileName -> {
////            File file = new File(getOrInitUserFileDirectory(), fileName);
////            deleteFile(file);
////        });
////    }
////
////    @Override
////    public UserFileVo listUserFiles(int pageIndex, int pageSize) {
////
////        File userDir = getOrInitUserFileDirectory();
////        File[] userFiles = userDir.listFiles();
////        if (userFiles == null || userFiles.length == 0){
////            return new UserFileVo().setPageSize(pageSize);
////        }
////        int pageNum = userFiles.length / pageSize;
////        if (userFiles.length % pageSize != 0){
////            pageNum ++;
////        }
////        UserFileVo userFileVo = new UserFileVo().setTotalSize(userFiles.length).setPageNum(pageNum).setPageSize(pageSize);
////        Arrays.sort(userFiles, (file1, file2) -> (int) (file2.lastModified() / 1000 - file1.lastModified() / 1000));
////        if ((pageIndex - 1) * pageSize >= userFiles.length){
////            return userFileVo;
////        }
////
////        List<UserFileVo.FileDetailVo> fileDetailVoList = new ArrayList<>();
////
////        for (int i = (pageIndex - 1) * pageSize; i < userFiles.length && i < pageIndex * pageSize; i++) {
////            File file = userFiles[i];
////            UserFileVo.FileDetailVo detailVo = new UserFileVo.FileDetailVo()
////                    .setFileName(file.getName())
////                    .setFileSize(FileUtil.getFileSizeStr(file))
////                    .setLastModifiedTime(DateTimeUtil.dateToStr(new Date(file.lastModified())));
////            fileDetailVoList.add(detailVo);
////        }
////
////        return userFileVo.setPageIndex(pageIndex).setFileDetailList(fileDetailVoList);
////    }
//
//    private String getUsername(){
//        return ThreadLocalUtil.getUsername();
//    }
//
//    private File getOrInitUserFileDirectory(){
//        File userDir = new File(filePath, getUsername());
//        if (!userDir.exists() && !userDir.mkdir()){
//            throw new PromptException("创建文件夹失败");
//        }
//        return userDir;
//    }
//}

