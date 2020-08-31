package com.spongeli.service.utils;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * 图片工具
 * @author jichao
 *
 */
public class PicUtil {

    /**
     * 指定大小进行缩放
     * @param srcUrl 源图片地址
     * @param targetUrl 目标图片地址
     * @param width 宽
     * @param height 高
     * @throws IOException
     */
    public static void resize(String srcUrl,String targetUrl,int width,int height) throws IOException {
        /*
         * size(width,height) 若图片横比200小，高比300小，不变
         * 若图片横比200小，高比300大，高缩小到300，图片比例不变 若图片横比200大，高比300小，横缩小到200，图片比例不变
         * 若图片横比200大，高比300大，图片按比例缩小，横为200或高为300
         */
        Thumbnails.of(srcUrl).size(width, height).toFile(targetUrl);
    }


    /**
     * 按照比例进行缩放
     * @param srcUrl 源图片地址
     * @param targetUrl 目标图片地址
     * @param num 质量比例如 0.8
     * @throws IOException
     */
    public static void scale(String srcUrl,String targetUrl,double num) throws IOException {
        Thumbnails.of(srcUrl).scale(num).toFile(targetUrl );
    }

    /**
     * 水印
     * @param srcUrl 源图片地址
     * @param targetUrl 目标图片地址
     * @param width 宽
     * @param height 高
     * @param num 质量比例如 0.8
     * @param pos 显示位置:  Positions.BOTTOM_RIGHT
     * @throws IOException
     */
    public static void watermark(String srcUrl,String targetUrl,int width,int height,float num,Positions pos) throws IOException {
        Thumbnails.of(srcUrl).size(width,height).watermark(pos, ImageIO.read(new File(targetUrl)), num).outputQuality(num).toFile(targetUrl);
    }

    /**
     * 裁剪
     * @param srcUrl 源图片地址
     * @param targetUrl 目标图片地址
     * @param width 宽
     * @param height 高
     * @param pos 显示位置:  Positions.BOTTOM_RIGHT
     * @param x 区域宽度
     * @param y 区域高度
     * @throws IOException
     */
    public static void cut(String srcUrl, String targetUrl, int width, int height, Positions pos, int x, int y)throws IOException {
        Thumbnails.of(srcUrl).sourceRegion(pos,x,y).size(width, height).keepAspectRatio(false).toFile(targetUrl);
    }


    /**
     * 裁剪--指定坐标/大小
     * @param srcUrl 源图片地址
     * @param targetUrl 目标图片地址
     * @param width 宽
     * @param height 高
     * @param pointA_1 坐标A1
     * @throws IOException
     */
    public static void cut(String srcUrl,String targetUrl,int width,int height,int pointA_1,int pointA_2,int pointB_1,int pointB_2) throws IOException {
        Thumbnails.of(srcUrl).sourceRegion(pointA_1, pointA_2, pointB_1, pointB_2).size(width, height).keepAspectRatio(false).toFile(targetUrl);
    }

    /**
     * 转化图像格式
     * @param srcUrl 源图片地址
     * @param targetUrl 目标图片地址
     * @param width 宽
     * @param height 高
     * @param format 格式 如png/gif/jpg
     * @throws IOException
     */
    public static void format(String srcUrl,String targetUrl,int width,int height,String format) throws IOException {
        Thumbnails.of(srcUrl).size(width, height).outputFormat(format).toFile(targetUrl);
    }
}