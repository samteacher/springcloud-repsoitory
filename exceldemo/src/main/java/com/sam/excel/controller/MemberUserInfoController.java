package com.sam.excel.controller;

import com.sam.excel.entity.Membership_user_info;
import com.sam.excel.service.MemberUserInfoService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @description 查询数据表导出Excel
 *
 * @author Administrator
 */
@RestController
public class MemberUserInfoController {

    @Autowired
    MemberUserInfoService memberUserInfoService;

    @RequestMapping("/go")
    public String go(){
        return "gogogogog";
    }

    @RequestMapping("/exceldownload")
    public void downloadAllClassmate(HttpServletResponse response) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("信息表");

        List<Membership_user_info> classmateList = memberUserInfoService.saveExcel();

        //设置要导出的文件的名字
        String fileName = "userinf" + ".xls";

        //新增数据行，并且设置单元格数据
        int rowNum = 1;

        String[] headers = {"ID", "渠道", "城市", "会员号","归属门店"};
        //headers表示excel表中第一行的表头

        HSSFRow row = sheet.createRow(0);
        //在excel表中添加表头

        for (int i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        //在表中存放查询到的数据放入对应的列
        for (Membership_user_info membership_user_info : classmateList) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(membership_user_info.getId());
            row1.createCell(1).setCellValue(membership_user_info.getChannel());
            row1.createCell(2).setCellValue(membership_user_info.getCity());
            row1.createCell(3).setCellValue(membership_user_info.getMemberNumber());
            row1.createCell(4).setCellValue(membership_user_info.getBelongingStores());
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());

    }

}
