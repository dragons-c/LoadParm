package com.gaoyang.loadparm.utils;


import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author WT ZHONG
 * @version 1.0
 * @date 2020/1/17 16:37
 * POI工具类，用于操作Excel
 */
public class ExcelUtils {

    /**
     * 防止实例化
     */
    private ExcelUtils() {
    }

    /**
     * 读取Excel值，并存入Map中
     * @param pathNameExcel Excel路径
     * @return List<Aitcmib>
     */
    public static List<Object> getExcelMap(String pathNameExcel){
        List<Object> aitcmibs = new ArrayList<Object>();
        try {
            //读取Excel
            List<List<Object>> lists = ExcelUtils.readExcel(new File(pathNameExcel));
            if (lists == null){
                System.out.println("不存在该文件");
                return null;
//            }
//            for (int i = 0; i < lists.size(); i++){
//                //取出一行
//                List<Object> list = lists.get(i);
//                //存入对象中
//                Aitcmib aitcmib = new Aitcmib();
//                //必输
//                aitcmib.setGL_BOOK((String)list.get(0));
//                aitcmib.setBR(new BigDecimal((String)list.get(1)));
//                aitcmib.setITM((String)list.get(2));
//                aitcmib.setSEQ(new BigDecimal((String)list.get(3)));
//                aitcmib.setENG_NM((String)list.get(4));
//                aitcmib.setSTS((String)list.get(5));
//                aitcmib.setAC_TYP((String) list.get(6));
//                aitcmib.setCCY_LMT((String) list.get(7));
//                aitcmib.setBAL_DIR((String)list.get(8));
//                aitcmib.setBAL_RFLG((String)list.get(9));
//                aitcmib.setAMT_DIR((String)list.get(10));
//                aitcmib.setDTL_FLG((String)list.get(11));
//                aitcmib.setRVS_TYP((String)list.get(12));
//                aitcmib.setAC_EXP(new BigDecimal((String) list.get(13)));
//                aitcmib.setMANUAL_FLG((String)list.get(14));
//                aitcmib.setONL_FLG((String)list.get(15));
//                aitcmib.setCARD_FLG((String)list.get(16));
//                aitcmib.setEFF_DATE(new BigDecimal((String) list.get(17)));
//                aitcmib.setEXP_DATE(new BigDecimal((String) list.get(18)));
//                //todo 非必输 后续在再管
//               aitcmib.setCHS_NM(((String)(list.get(19))).getBytes());
//               //aitcmib.setRVS_KND((String)list.get(20));
//               //aitcmib.setRVS_EXP((BigDecimal)list.get(21));
//               //aitcmib.setRVS_UNIT((String)list.get(22));
//               //aitcmib.setDRLT_BAL((BigDecimal)list.get(23));
//               //aitcmib.setCRLT_BAL((BigDecimal)list.get(24));
//               //aitcmib.setBAL_CHK((String)list.get(25));
//               //aitcmib.setAPP1((String)list.get(26));
//               //aitcmib.setAPP2((String)list.get(27));
//               //aitcmib.setAPP3((String)list.get(28));
//               //aitcmib.setAPP4((String)list.get(29));
//               //aitcmib.setAPP5((String)list.get(30));
//               //aitcmib.setAPP6((String)list.get(31));
//               //aitcmib.setAPP7((String)list.get(32));
//               //aitcmib.setAPP8((String)list.get(33));
//               //aitcmib.setAPP9((String)list.get(34));
//               //aitcmib.setAPP10((String)list.get(35));
//               //aitcmib.setLAST_UPDATE_TLR((String)list.get(36));
//               //aitcmib.setUPDTBL_DATE((BigDecimal) list.get(37));
//                //创建时间
//                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                String time = df.format(new Date());
//                Timestamp ts = Timestamp.valueOf(time);
//                aitcmib.setTS(ts);
//                //存入集合中
//                aitcmibs.add(aitcmib);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aitcmibs;
    }

    /**
     * 开始逐行读取excel数据
     * @param sheet Excel表
     * @return 所有数据的集合
     */
    private static List<List<Object>> startReadExcel(XSSFSheet sheet){
        List<List<Object>> list = new LinkedList<>();
        XSSFRow row = null;
        XSSFCell cell = null;
        //逐行读取Excel表
        for (int i = (sheet.getFirstRowNum() + 1); i <= (sheet.getPhysicalNumberOfRows() - 1); i++) {
            row = sheet.getRow(i);
            if (row == null) {
                continue;
            }

            //每行数据存储在一个list中
            List<Object> linked = new LinkedList<Object>();
            for (int j = row.getFirstCellNum(); j <= row.getLastCellNum(); j++) {
                Object value = null;
                cell = row.getCell(j);
                if (cell == null || row.getPhysicalNumberOfCells()==0) {
                    continue;
                }
                switch (cell.getCellTypeEnum()) {
                    case STRING:
                        //String类型返回String数据
                        value = cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        //日期数据返回LONG类型的时间戳
                        if ("yyyy\"年\"m\"月\"d\"日\";@".equals(cell.getCellStyle().getDataFormatString())) {
                            //System.out.println(cell.getNumericCellValue()+":日期格式："+cell.getCellStyle().getDataFormatString());
                            value = DateUtils.getMillis(HSSFDateUtil.getJavaDate(cell.getNumericCellValue())) / 1000;
                        } else {
                            //数值类型返回double类型的数字
                            //System.out.println(cell.getNumericCellValue()+":格式："+cell.getCellStyle().getDataFormatString());
                            value =String.valueOf(cell.getNumericCellValue()) ;
                        }
                        break;
                    case BOOLEAN:
                        //布尔类型
                        value = cell.getBooleanCellValue();
                        break;
                    case BLANK:
                        //空单元格
                        break;
                    default:
                        value = cell.toString();
                }
//              if (value != null && !value.equals("")) {
                    //单元格不为空，则加入列表
                    linked.add(value);
//               }
            }
            if (linked.size()!= 0) {
                //把每一行数据添加到总的List中
                list.add(linked);
            }
        }
        return list;
    }

    /**
     * 要求excel版本在2007以上
     *
     * @param file 文件信息
     * @return
     * @throws Exception
     */
    public static List<List<Object>> readExcel(File file) throws Exception {
        if(!file.exists()){
            return null;
        }
        XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream(file));
        // 读取第一张表格内容
        XSSFSheet sheet = xwb.getSheetAt(0);
        return startReadExcel(sheet);
    }

    /**
     * 要求excel版本在2007以下
     *
     * @param fileInputStream 文件信息
     * @return
     * @throws Exception
     */
    public static List<List<Object>> readExcel(FileInputStream fileInputStream) throws Exception {
        XSSFWorkbook xwb = new XSSFWorkbook(fileInputStream);
        //读取第一张表格内容
        XSSFSheet sheet = xwb.getSheetAt(1);
        return startReadExcel(sheet);
    }

    /**
     * 导出excel
     * @param excelPath 导出的excel路径（需要带.xlsx)
     * @param headList  excel的标题备注名称
     * @param fieldList excel的标题字段（与数据中map中键值对应）
     * @param dataList  excel数据
     * @throws Exception
     */
    public static void createExcel(String excelPath, String[] headList,
                                   String[] fieldList, List<Map<String, Object>> dataList)
            throws Exception {
        // 创建新的Excel 工作簿
        XSSFWorkbook workbook = new XSSFWorkbook();
        // 在Excel工作簿中建一工作表，其名为缺省值
        XSSFSheet sheet = workbook.createSheet();
        // 在索引0的位置创建行（最顶端的行）
        XSSFRow row = sheet.createRow(0);
        // 设置excel头（第一行）的头名称
        for (int i = 0; i < headList.length; i++) {

            // 在索引0的位置创建单元格（左上端）
            XSSFCell cell = row.createCell(i);
            // 定义单元格为字符串类型
            cell.setCellType(CellType.STRING);
            // 在单元格中输入一些内容
            cell.setCellValue(headList[i]);
        }
        //添加数据
        for (int n = 0; n < dataList.size(); n++) {
            // 在索引1的位置创建行（最顶端的行）
            XSSFRow row_value = sheet.createRow(n + 1);
            Map<String, Object> dataMap = dataList.get(n);
            for (int i = 0; i < fieldList.length; i++) {

                // 在索引0的位置创建单元格（左上端）
                XSSFCell cell = row_value.createCell(i);
                // 定义单元格为字符串类型
                cell.setCellType(CellType.STRING);
                // 在单元格中输入一些内容
                if (dataMap.get(fieldList[i]) != null){
                    cell.setCellValue((dataMap.get(fieldList[i])).toString());
                }
            }
        }
        // 新建一输出文件流
        FileOutputStream fos = new FileOutputStream(excelPath);
        // 把相应的Excel 工作簿存盘
        workbook.write(fos);
        fos.flush();
        // 操作结束，关闭文件
        fos.close();
    }
}