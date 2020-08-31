package com.spongeli.service.utils;

import org.gavaghan.geodesy.Ellipsoid;
import org.gavaghan.geodesy.GeodeticCalculator;
import org.gavaghan.geodesy.GeodeticCurve;
import org.gavaghan.geodesy.GlobalCoordinates;

public class GeodesyUtil {
    public static Double getDistanceMeter(GlobalCoordinates gpsFrom, GlobalCoordinates gpsTo) {
        //创建GeodeticCalculator，调用计算方法，传入坐标系、经纬度用于计算距离
        GeodeticCurve geoCurve = new GeodeticCalculator().calculateGeodeticCurve(Ellipsoid.WGS84, gpsFrom, gpsTo);
        return geoCurve.getEllipsoidalDistance();
    }
}
