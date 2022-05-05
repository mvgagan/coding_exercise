package com.company;

public class PaintJob {

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {

        int buckets;

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }

        buckets = (int) Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
        return buckets;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {

        int buckets;

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        buckets = (int) Math.ceil((width * height) / areaPerBucket);
        return buckets;
    }

    public static int getBucketCount (double area, double areaPerBucket) {

        int buckets;

        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        buckets = (int) Math.ceil(area / areaPerBucket);
        return buckets;
    }
}
