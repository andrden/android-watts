package org.boofcv.example.android;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by denny on 5/18/15.
 */
public enum ColorSet {
    RED("0_32_96=false, 128_64_0=false, 160_0_32=true, 128_192_160=false, 32_0_128=false, 96_0_32=false, 32_32_192=false, 0_224_64=false, 96_96_32=false, 192_0_128=true, 64_192_32=false, 64_224_96=false, 0_192_32=false, 32_128_64=false, 128_32_192=false, 192_160_32=false, 192_64_224=false, 128_0_192=false, 96_64_192=false, 96_32_160=false, 128_160_128=false, 224_224_192=false, 192_32_224=false, 192_96_160=false, 64_224_64=false, 224_64_160=true, 32_0_224=false, 0_0_32=false, 128_0_160=false, 96_160_96=false, 32_64_0=false, 224_160_96=false, 224_0_224=false, 96_64_160=false, 128_128_64=false, 128_64_192=false, 224_224_160=false, 160_0_224=false, 224_32_224=false, 64_0_160=false, 96_128_32=false, 128_128_128=false, 128_96_32=false, 96_96_64=false, 64_96_224=false, 96_0_192=false, 224_96_160=true, 0_0_224=false, 192_0_160=false, 64_192_224=false, 64_0_192=false, 224_160_32=false, 64_0_64=false, 128_192_128=false, 96_32_192=false, 224_0_128=true, 192_96_192=false, 224_64_192=false, 160_128_96=false, 224_192_96=false, 96_0_128=false, 160_224_0=false, 128_32_0=true, 32_160_96=false, 224_160_192=false, 0_224_32=false, 160_32_96=true, 160_224_64=false, 128_128_192=false, 224_192_192=false, 32_32_0=false, 64_96_128=false, 224_32_0=true, 64_192_64=false, 32_128_32=false, 192_160_64=false, 192_192_96=false, 32_32_96=false, 32_96_32=false, 160_224_32=false, 160_32_64=true, 0_0_128=false, 96_96_96=false, 0_96_224=false, 128_128_160=false, 0_128_224=false, 224_96_192=false, 96_0_160=false, 96_96_192=false, 128_192_224=false, 192_0_32=true, 64_224_32=false, 0_0_64=false, 224_224_128=false, 96_160_64=false, 224_160_64=false, 128_160_96=false, 64_0_96=false, 128_160_224=false, 128_128_32=false, 192_224_96=false, 192_192_128=false, 0_96_0=false, 224_32_192=false, 160_192_128=false, 224_192_64=false, 192_128_224=false, 192_192_32=false, 32_160_64=false, 192_32_160=false, 32_224_0=false, 160_224_96=false, 96_64_224=false, 224_192_160=false, 0_96_128=false, 32_96_160=false, 64_64_128=false, 224_128_0=false, 128_224_160=false, 96_128_96=false, 64_160_224=false, 192_96_64=false, 192_0_192=false, 0_128_128=false, 224_32_32=true, 64_96_160=false, 224_96_224=false, 0_160_32=false, 0_64_224=false, 224_192_0=false, 64_128_128=false, 160_192_32=false, 32_32_128=false, 64_192_128=false, 160_0_160=false, 224_0_32=true, 64_160_64=false, 0_160_224=false, 96_64_32=false, 160_192_224=false, 192_0_64=true, 64_192_160=false, 192_192_224=false, 128_64_64=false, 192_128_128=false, 160_64_192=false, 160_96_0=false, 160_224_192=false, 192_32_192=false, 160_0_192=false, 0_0_160=false, 64_160_32=false, 64_64_224=false, 96_160_224=false, 96_160_0=false, 192_192_64=false, 64_192_96=false, 128_0_96=false, 32_32_64=false, 0_96_160=false, 160_96_224=false, 192_224_192=false, 32_96_64=false, 192_0_0=true, 64_64_0=false, 32_192_128=false, 128_64_128=false, 0_96_32=false, 224_64_96=true, 64_32_96=false, 128_0_0=true, 0_0_0=false, 0_192_64=false, 192_32_128=true, 0_32_192=false, 32_32_32=false, 224_224_0=false, 224_96_128=true, 224_32_64=true, 224_192_128=false, 64_96_192=false, 96_128_64=false, 192_192_160=false, 32_192_224=false, 64_0_224=false, 96_160_160=false, 0_160_64=false, 224_0_64=true, 64_160_96=false, 128_224_128=false, 0_128_160=false, 192_0_96=true, 224_32_160=true, 32_64_32=false, 128_160_160=false, 160_0_128=false, 32_32_160=false, 64_32_0=false, 32_96_96=false, 96_224_32=false, 96_0_64=false, 32_192_96=false, 160_224_160=false, 192_96_224=false, 128_128_96=false, 128_224_64=false, 0_0_192=false, 128_96_96=false, 32_96_192=false, 32_224_192=false, 192_96_32=false, 96_64_128=false, 128_160_192=false, 0_96_192=false, 128_0_64=false, 128_160_0=false, 64_0_0=false, 128_96_64=false, 96_0_96=false, 224_32_128=true, 64_0_128=false, 128_224_32=false, 128_224_224=false, 0_192_96=false, 96_160_128=false, 32_224_160=false, 64_192_192=false, 224_192_32=false, 160_64_0=true, 32_192_0=false, 128_64_32=false, 32_160_32=false, 32_96_0=false, 224_32_96=true, 32_128_0=false, 64_128_224=false, 192_96_128=false, 224_0_96=true, 0_128_192=false, 32_64_64=false, 128_64_160=false, 0_160_128=false, 32_160_192=false, 224_96_96=false, 96_192_0=false, 32_160_0=false, 192_64_64=true, 64_64_96=false, 0_160_192=false, 64_160_192=false, 32_224_96=false, 32_128_192=false, 160_96_160=false, 96_192_32=false, 96_224_64=false, 96_224_160=false, 32_192_64=false, 64_224_160=false, 64_128_192=false, 128_224_96=false, 64_128_32=false, 96_128_192=false, 160_64_32=true, 160_64_128=false, 96_128_0=false, 160_224_128=false, 160_128_192=false, 128_0_32=true, 0_32_160=false, 96_32_32=false, 160_192_192=false, 32_0_32=false, 160_160_160=false, 0_64_192=false, 160_160_64=false, 160_32_224=false, 0_96_96=false, 96_160_192=false, 64_32_32=false, 224_224_32=false, 192_160_0=false, 224_64_32=true, 160_128_160=false, 128_32_32=true, 224_0_0=true, 128_192_32=false, 96_32_64=false, 160_160_192=false, 64_128_0=false, 0_64_160=false, 224_192_224=false, 160_160_32=false, 160_64_224=false, 192_160_192=false, 64_192_0=false, 192_224_128=false, 64_32_192=false, 128_96_224=false, 32_64_96=false, 64_64_192=false, 224_96_64=false, 0_160_160=false, 192_32_0=true, 0_224_160=false, 128_192_0=false, 192_64_32=true, 96_64_0=false, 32_224_128=false, 64_160_160=false, 160_224_224=false, 64_64_64=false, 192_192_192=false, 96_192_64=false, 32_192_32=false, 160_32_128=false, 64_128_64=false, 160_96_192=false, 0_160_96=false, 128_128_0=false, 0_128_32=false, 160_192_96=false, 96_128_160=false, 96_64_96=false, 192_128_192=false, 32_96_128=false, 160_32_0=true, 128_32_96=false, 64_64_160=false, 192_96_96=false, 160_192_160=false, 96_32_0=false, 0_128_64=false, 224_160_0=false, 224_224_64=false, 64_32_64=false, 224_64_64=true, 0_32_224=false, 160_160_128=false, 32_160_160=false, 0_64_0=false, 32_192_192=false, 160_96_128=false, 96_192_192=false, 32_224_224=false, 192_128_0=false, 128_64_96=false, 192_64_96=true, 96_224_224=false, 0_224_224=false, 128_64_224=false, 64_128_160=false, 224_128_224=false, 160_32_160=false, 32_192_160=false, 32_96_224=false, 192_224_160=false, 64_96_0=false, 128_224_192=false, 96_192_96=false, 64_128_96=false, 0_96_64=false, 160_192_64=false, 64_160_128=false, 0_32_128=false, 192_192_0=false, 64_224_0=false, 96_64_64=false, 192_128_160=false, 0_160_0=false, 0_192_192=false, 96_224_128=false, 128_32_64=false, 0_64_32=false, 32_64_224=false, 0_224_128=false, 160_64_160=false, 96_128_128=false, 96_224_96=false, 0_64_128=false, 32_32_224=false, 128_224_0=false, 64_224_192=false, 224_128_128=false, 64_32_160=false, 192_32_32=true, 224_224_96=false, 128_0_224=false, 0_0_96=false, 192_64_0=true, 160_192_0=false, 96_160_32=false, 128_32_224=false, 128_160_64=false, 192_128_32=false, 160_128_224=false, 224_224_224=false, 128_96_160=false, 32_160_224=false, 192_224_0=false, 224_0_160=true, 192_32_64=true, 64_96_96=false, 160_32_192=false, 64_32_224=false, 224_128_64=false, 32_64_128=false, 160_96_32=false, 64_0_32=false, 0_128_96=false, 0_64_96=false, 96_128_224=false, 192_64_192=false, 160_128_0=false, 192_160_224=false, 32_128_224=false, 0_192_160=false, 160_0_96=true, 160_128_64=false, 224_128_160=false, 0_128_0=false, 224_128_32=false, 0_64_64=false, 160_0_0=true, 224_160_160=false, 128_32_128=false, 96_192_160=false, 32_224_32=false, 32_160_128=false, 224_64_0=true, 160_64_96=true, 32_0_192=false, 192_224_64=false, 0_32_32=false, 128_96_0=false, 96_0_224=false, 160_160_224=false, 192_160_96=false, 64_32_128=false, 96_32_224=false, 160_32_32=true, 128_96_192=false, 0_192_0=false, 224_0_192=false, 192_160_128=false, 32_128_128=false, 96_96_160=false, 32_128_96=false, 96_192_224=false, 0_224_192=false, 224_128_96=false, 128_192_96=false, 32_0_64=false, 224_64_224=false, 160_96_64=false, 160_160_96=false, 192_224_224=false, 224_160_224=false, 0_192_224=false, 128_96_128=false, 192_64_160=false, 64_96_32=false, 96_96_224=false, 160_160_0=false, 160_0_64=true, 128_192_192=false, 96_32_128=false, 192_96_0=false, 224_128_192=false, 96_224_0=false, 64_224_128=false, 128_128_224=false, 128_160_32=false, 32_64_160=false, 192_128_64=false, 96_224_192=false, 160_64_64=true, 192_224_32=false, 192_32_96=true, 224_96_32=false, 64_96_64=false, 128_32_160=false, 0_32_0=false, 0_224_0=false, 96_96_0=false, 64_64_32=false, 192_0_224=false, 32_64_192=false, 192_128_96=false, 0_192_128=false, 96_0_0=false, 160_128_128=false, 224_160_128=false, 0_32_64=false, 96_96_128=false, 0_224_96=false, 160_128_32=false, 128_192_64=false, 96_32_96=false, 32_0_96=false, 64_224_224=false, 192_64_128=true, 64_160_0=false, 224_64_128=true, 32_128_160=false, 32_224_64=false, 32_0_0=false, 160_96_96=false, 192_160_160=false, 224_96_0=false, 96_192_128=false, 32_0_160=false, 128_0_128=false"),
    GREEN("0_32_96=false, 128_64_0=false, 160_0_32=false, 128_192_160=false, 32_0_128=false, 96_0_32=false, 32_32_192=false, 0_224_64=true, 96_96_32=false, 192_0_128=false, 64_192_32=true, 64_224_96=true, 0_192_32=true, 32_128_64=true, 128_32_192=false, 192_160_32=false, 192_64_224=false, 128_0_192=false, 96_64_192=false, 96_32_160=false, 128_160_128=false, 224_224_192=false, 192_32_224=false, 192_96_160=false, 64_224_64=true, 224_64_160=false, 32_0_224=false, 0_0_32=false, 128_0_160=false, 96_160_96=true, 32_64_0=true, 224_160_96=false, 224_0_224=false, 96_64_160=false, 128_128_64=false, 128_64_192=false, 224_224_160=false, 160_0_224=false, 224_32_224=false, 64_0_160=false, 96_128_32=true, 128_128_128=false, 128_96_32=false, 96_96_64=false, 64_96_224=false, 96_0_192=false, 224_96_160=false, 0_0_224=false, 192_0_160=false, 64_192_224=false, 64_0_192=false, 224_160_32=false, 64_0_64=false, 128_192_128=false, 96_32_192=false, 224_0_128=false, 192_96_192=false, 224_64_192=false, 160_128_96=false, 224_192_96=false, 96_0_128=false, 160_224_0=true, 128_32_0=false, 32_160_96=true, 224_160_192=false, 0_224_32=true, 160_32_96=false, 160_224_64=true, 128_128_192=false, 224_192_192=false, 32_32_0=false, 64_96_128=false, 224_32_0=false, 64_192_64=true, 32_128_32=true, 192_160_64=false, 192_192_96=false, 32_32_96=false, 32_96_32=true, 160_224_32=true, 160_32_64=false, 0_0_128=false, 96_96_96=false, 0_96_224=false, 128_128_160=false, 0_128_224=false, 224_96_192=false, 96_0_160=false, 96_96_192=false, 128_192_224=false, 192_0_32=false, 64_224_32=true, 0_0_64=false, 224_224_128=false, 96_160_64=true, 224_160_64=false, 128_160_96=false, 64_0_96=false, 128_160_224=false, 128_128_32=false, 192_224_96=false, 192_192_128=false, 0_96_0=true, 224_32_192=false, 160_192_128=false, 224_192_64=false, 192_128_224=false, 192_192_32=false, 32_160_64=true, 192_32_160=false, 32_224_0=true, 160_224_96=false, 96_64_224=false, 224_192_160=false, 0_96_128=false, 32_96_160=false, 64_64_128=false, 224_128_0=false, 128_224_160=true, 96_128_96=false, 64_160_224=false, 192_96_64=false, 192_0_192=false, 0_128_128=false, 224_32_32=false, 64_96_160=false, 224_96_224=false, 0_160_32=true, 0_64_224=false, 224_192_0=false, 64_128_128=false, 160_192_32=true, 32_32_128=false, 64_192_128=true, 160_0_160=false, 224_0_32=false, 64_160_64=true, 0_160_224=false, 96_64_32=false, 160_192_224=false, 192_0_64=false, 64_192_160=false, 192_192_224=false, 128_64_64=false, 192_128_128=false, 160_64_192=false, 160_96_0=false, 160_224_192=false, 192_32_192=false, 160_0_192=false, 0_0_160=false, 64_160_32=true, 64_64_224=false, 96_160_224=false, 96_160_0=true, 192_192_64=false, 64_192_96=true, 128_0_96=false, 32_32_64=false, 0_96_160=false, 160_96_224=false, 192_224_192=false, 32_96_64=true, 192_0_0=false, 64_64_0=false, 32_192_128=true, 128_64_128=false, 0_96_32=true, 224_64_96=false, 64_32_96=false, 128_0_0=false, 0_0_0=false, 0_192_64=true, 192_32_128=false, 0_32_192=false, 32_32_32=false, 224_224_0=false, 224_96_128=false, 224_32_64=false, 224_192_128=false, 64_96_192=false, 96_128_64=true, 192_192_160=false, 32_192_224=false, 64_0_224=false, 96_160_160=false, 0_160_64=true, 224_0_64=false, 64_160_96=true, 128_224_128=true, 0_128_160=false, 192_0_96=false, 224_32_160=false, 32_64_32=true, 128_160_160=false, 160_0_128=false, 32_32_160=false, 64_32_0=false, 32_96_96=false, 96_224_32=true, 96_0_64=false, 32_192_96=true, 160_224_160=false, 192_96_224=false, 128_128_96=false, 128_224_64=true, 0_0_192=false, 128_96_96=false, 32_96_192=false, 32_224_192=false, 192_96_32=false, 96_64_128=false, 128_160_192=false, 0_96_192=false, 128_0_64=false, 128_160_0=true, 64_0_0=false, 128_96_64=false, 96_0_96=false, 224_32_128=false, 64_0_128=false, 128_224_32=true, 128_224_224=false, 0_192_96=true, 96_160_128=false, 32_224_160=true, 64_192_192=false, 224_192_32=false, 160_64_0=false, 32_192_0=true, 128_64_32=false, 32_160_32=true, 32_96_0=true, 224_32_96=false, 32_128_0=true, 64_128_224=false, 192_96_128=false, 224_0_96=false, 0_128_192=false, 32_64_64=false, 128_64_160=false, 0_160_128=true, 32_160_192=false, 224_96_96=false, 96_192_0=true, 32_160_0=true, 192_64_64=false, 64_64_96=false, 0_160_192=false, 64_160_192=false, 32_224_96=true, 32_128_192=false, 160_96_160=false, 96_192_32=true, 96_224_64=true, 96_224_160=true, 32_192_64=true, 64_224_160=true, 64_128_192=false, 128_224_96=true, 64_128_32=true, 96_128_192=false, 160_64_32=false, 160_64_128=false, 96_128_0=true, 160_224_128=false, 160_128_192=false, 128_0_32=false, 0_32_160=false, 96_32_32=false, 160_192_192=false, 32_0_32=false, 160_160_160=false, 0_64_192=false, 160_160_64=false, 160_32_224=false, 0_96_96=false, 96_160_192=false, 64_32_32=false, 224_224_32=false, 192_160_0=false, 224_64_32=false, 160_128_160=false, 128_32_32=false, 224_0_0=false, 128_192_32=true, 96_32_64=false, 160_160_192=false, 64_128_0=true, 0_64_160=false, 224_192_224=false, 160_160_32=false, 160_64_224=false, 192_160_192=false, 64_192_0=true, 192_224_128=false, 64_32_192=false, 128_96_224=false, 32_64_96=false, 64_64_192=false, 224_96_64=false, 0_160_160=false, 192_32_0=false, 0_224_160=true, 128_192_0=true, 192_64_32=false, 96_64_0=false, 32_224_128=true, 64_160_160=false, 160_224_224=false, 64_64_64=false, 192_192_192=false, 96_192_64=true, 32_192_32=true, 160_32_128=false, 64_128_64=true, 160_96_192=false, 0_160_96=true, 128_128_0=false, 0_128_32=true, 160_192_96=false, 96_128_160=false, 96_64_96=false, 192_128_192=false, 32_96_128=false, 160_32_0=false, 128_32_96=false, 64_64_160=false, 192_96_96=false, 160_192_160=false, 96_32_0=false, 0_128_64=true, 224_160_0=false, 224_224_64=false, 64_32_64=false, 224_64_64=false, 0_32_224=false, 160_160_128=false, 32_160_160=false, 0_64_0=true, 32_192_192=false, 160_96_128=false, 96_192_192=false, 32_224_224=false, 192_128_0=false, 128_64_96=false, 192_64_96=false, 96_224_224=false, 0_224_224=false, 128_64_224=false, 64_128_160=false, 224_128_224=false, 160_32_160=false, 32_192_160=false, 32_96_224=false, 192_224_160=false, 64_96_0=true, 128_224_192=false, 96_192_96=true, 64_128_96=true, 0_96_64=true, 160_192_64=true, 64_160_128=true, 0_32_128=false, 192_192_0=false, 64_224_0=true, 96_64_64=false, 192_128_160=false, 0_160_0=true, 0_192_192=false, 96_224_128=true, 128_32_64=false, 0_64_32=true, 32_64_224=false, 0_224_128=true, 160_64_160=false, 96_128_128=false, 96_224_96=true, 0_64_128=false, 32_32_224=false, 128_224_0=true, 64_224_192=false, 224_128_128=false, 64_32_160=false, 192_32_32=false, 224_224_96=false, 128_0_224=false, 0_0_96=false, 192_64_0=false, 160_192_0=false, 96_160_32=true, 128_32_224=false, 128_160_64=true, 192_128_32=false, 160_128_224=false, 224_224_224=false, 128_96_160=false, 32_160_224=false, 192_224_0=false, 224_0_160=false, 192_32_64=false, 64_96_96=false, 160_32_192=false, 64_32_224=false, 224_128_64=false, 32_64_128=false, 160_96_32=false, 64_0_32=false, 0_128_96=true, 0_64_96=false, 96_128_224=false, 192_64_192=false, 160_128_0=false, 192_160_224=false, 32_128_224=false, 0_192_160=false, 160_0_96=false, 160_128_64=false, 224_128_160=false, 0_128_0=true, 224_128_32=false, 0_64_64=false, 160_0_0=false, 224_160_160=false, 128_32_128=false, 96_192_160=false, 32_224_32=true, 32_160_128=true, 224_64_0=false, 160_64_96=false, 32_0_192=false, 192_224_64=false, 0_32_32=false, 128_96_0=false, 96_0_224=false, 160_160_224=false, 192_160_96=false, 64_32_128=false, 96_32_224=false, 160_32_32=false, 128_96_192=false, 0_192_0=true, 224_0_192=false, 192_160_128=false, 32_128_128=false, 96_96_160=false, 32_128_96=true, 96_192_224=false, 0_224_192=false, 224_128_96=false, 128_192_96=true, 32_0_64=false, 224_64_224=false, 160_96_64=false, 160_160_96=false, 192_224_224=false, 224_160_224=false, 0_192_224=false, 128_96_128=false, 192_64_160=false, 64_96_32=true, 96_96_224=false, 160_160_0=false, 160_0_64=false, 128_192_192=false, 96_32_128=false, 192_96_0=false, 224_128_192=false, 96_224_0=true, 64_224_128=true, 128_128_224=false, 128_160_32=true, 32_64_160=false, 192_128_64=false, 96_224_192=false, 160_64_64=false, 192_224_32=false, 192_32_96=false, 224_96_32=false, 64_96_64=true, 128_32_160=false, 0_32_0=false, 0_224_0=true, 96_96_0=false, 64_64_32=false, 192_0_224=false, 32_64_192=false, 192_128_96=false, 0_192_128=true, 96_0_0=false, 160_128_128=false, 224_160_128=false, 0_32_64=false, 96_96_128=false, 0_224_96=true, 160_128_32=false, 128_192_64=true, 96_32_96=false, 32_0_96=false, 64_224_224=false, 192_64_128=false, 64_160_0=true, 224_64_128=false, 32_128_160=false, 32_224_64=true, 32_0_0=false, 160_96_96=false, 192_160_160=false, 224_96_0=false, 96_192_128=true, 32_0_160=false, 128_0_128=false"),
    BLUE("0_32_96=true, 128_64_0=false, 160_0_32=false, 128_192_160=false, 32_0_128=true, 96_0_32=false, 32_32_192=true, 0_224_64=false, 96_96_32=false, 192_0_128=false, 64_192_32=false, 64_224_96=false, 0_192_32=false, 32_128_64=false, 128_32_192=false, 192_160_32=false, 192_64_224=false, 128_0_192=false, 96_64_192=false, 96_32_160=false, 128_160_128=false, 224_224_192=false, 192_32_224=false, 192_96_160=false, 64_224_64=false, 224_64_160=false, 32_0_224=true, 0_0_32=false, 128_0_160=false, 96_160_96=false, 32_64_0=false, 224_160_96=false, 224_0_224=false, 96_64_160=false, 128_128_64=false, 128_64_192=false, 224_224_160=false, 160_0_224=false, 224_32_224=false, 64_0_160=true, 96_128_32=false, 128_128_128=false, 128_96_32=false, 96_96_64=false, 64_96_224=true, 96_0_192=false, 224_96_160=false, 0_0_224=true, 192_0_160=false, 64_192_224=true, 64_0_192=true, 224_160_32=false, 64_0_64=false, 128_192_128=false, 96_32_192=false, 224_0_128=false, 192_96_192=false, 224_64_192=false, 160_128_96=false, 224_192_96=false, 96_0_128=false, 160_224_0=false, 128_32_0=false, 32_160_96=false, 224_160_192=false, 0_224_32=false, 160_32_96=false, 160_224_64=false, 128_128_192=false, 224_192_192=false, 32_32_0=false, 64_96_128=false, 224_32_0=false, 64_192_64=false, 32_128_32=false, 192_160_64=false, 192_192_96=false, 32_32_96=true, 32_96_32=false, 160_224_32=false, 160_32_64=false, 0_0_128=true, 96_96_96=false, 0_96_224=true, 128_128_160=false, 0_128_224=true, 224_96_192=false, 96_0_160=false, 96_96_192=true, 128_192_224=true, 192_0_32=false, 64_224_32=false, 0_0_64=false, 224_224_128=false, 96_160_64=false, 224_160_64=false, 128_160_96=false, 64_0_96=true, 128_160_224=false, 128_128_32=false, 192_224_96=false, 192_192_128=false, 0_96_0=false, 224_32_192=false, 160_192_128=false, 224_192_64=false, 192_128_224=false, 192_192_32=false, 32_160_64=false, 192_32_160=false, 32_224_0=false, 160_224_96=false, 96_64_224=true, 224_192_160=false, 0_96_128=false, 32_96_160=true, 64_64_128=true, 224_128_0=false, 128_224_160=false, 96_128_96=false, 64_160_224=true, 192_96_64=false, 192_0_192=false, 0_128_128=false, 224_32_32=false, 64_96_160=true, 224_96_224=false, 0_160_32=false, 0_64_224=true, 224_192_0=false, 64_128_128=false, 160_192_32=false, 32_32_128=true, 64_192_128=false, 160_0_160=false, 224_0_32=false, 64_160_64=false, 0_160_224=true, 96_64_32=false, 160_192_224=false, 192_0_64=false, 64_192_160=false, 192_192_224=false, 128_64_64=false, 192_128_128=false, 160_64_192=false, 160_96_0=false, 160_224_192=false, 192_32_192=false, 160_0_192=false, 0_0_160=true, 64_160_32=false, 64_64_224=true, 96_160_224=true, 96_160_0=false, 192_192_64=false, 64_192_96=false, 128_0_96=false, 32_32_64=false, 0_96_160=true, 160_96_224=false, 192_224_192=false, 32_96_64=false, 192_0_0=false, 64_64_0=false, 32_192_128=false, 128_64_128=false, 0_96_32=false, 224_64_96=false, 64_32_96=true, 128_0_0=false, 0_0_0=false, 0_192_64=false, 192_32_128=false, 0_32_192=true, 32_32_32=false, 224_224_0=false, 224_96_128=false, 224_32_64=false, 224_192_128=false, 64_96_192=true, 96_128_64=false, 192_192_160=false, 32_192_224=true, 64_0_224=true, 96_160_160=false, 0_160_64=false, 224_0_64=false, 64_160_96=false, 128_224_128=false, 0_128_160=false, 192_0_96=false, 224_32_160=false, 32_64_32=false, 128_160_160=false, 160_0_128=false, 32_32_160=true, 64_32_0=false, 32_96_96=false, 96_224_32=false, 96_0_64=false, 32_192_96=false, 160_224_160=false, 192_96_224=false, 128_128_96=false, 128_224_64=false, 0_0_192=true, 128_96_96=false, 32_96_192=true, 32_224_192=false, 192_96_32=false, 96_64_128=false, 128_160_192=false, 0_96_192=true, 128_0_64=false, 128_160_0=false, 64_0_0=false, 128_96_64=false, 96_0_96=false, 224_32_128=false, 64_0_128=true, 128_224_32=false, 128_224_224=true, 0_192_96=false, 96_160_128=false, 32_224_160=false, 64_192_192=false, 224_192_32=false, 160_64_0=false, 32_192_0=false, 128_64_32=false, 32_160_32=false, 32_96_0=false, 224_32_96=false, 32_128_0=false, 64_128_224=true, 192_96_128=false, 224_0_96=false, 0_128_192=true, 32_64_64=false, 128_64_160=false, 0_160_128=false, 32_160_192=false, 224_96_96=false, 96_192_0=false, 32_160_0=false, 192_64_64=false, 64_64_96=false, 0_160_192=false, 64_160_192=false, 32_224_96=false, 32_128_192=true, 160_96_160=false, 96_192_32=false, 96_224_64=false, 96_224_160=false, 32_192_64=false, 64_224_160=false, 64_128_192=true, 128_224_96=false, 64_128_32=false, 96_128_192=true, 160_64_32=false, 160_64_128=false, 96_128_0=false, 160_224_128=false, 160_128_192=false, 128_0_32=false, 0_32_160=true, 96_32_32=false, 160_192_192=false, 32_0_32=false, 160_160_160=false, 0_64_192=true, 160_160_64=false, 160_32_224=false, 0_96_96=false, 96_160_192=false, 64_32_32=false, 224_224_32=false, 192_160_0=false, 224_64_32=false, 160_128_160=false, 128_32_32=false, 224_0_0=false, 128_192_32=false, 96_32_64=false, 160_160_192=false, 64_128_0=false, 0_64_160=true, 224_192_224=false, 160_160_32=false, 160_64_224=false, 192_160_192=false, 64_192_0=false, 192_224_128=false, 64_32_192=true, 128_96_224=false, 32_64_96=false, 64_64_192=true, 224_96_64=false, 0_160_160=false, 192_32_0=false, 0_224_160=false, 128_192_0=false, 192_64_32=false, 96_64_0=false, 32_224_128=false, 64_160_160=false, 160_224_224=true, 64_64_64=false, 192_192_192=false, 96_192_64=false, 32_192_32=false, 160_32_128=false, 64_128_64=false, 160_96_192=false, 0_160_96=false, 128_128_0=false, 0_128_32=false, 160_192_96=false, 96_128_160=false, 96_64_96=false, 192_128_192=false, 32_96_128=false, 160_32_0=false, 128_32_96=false, 64_64_160=true, 192_96_96=false, 160_192_160=false, 96_32_0=false, 0_128_64=false, 224_160_0=false, 224_224_64=false, 64_32_64=false, 224_64_64=false, 0_32_224=true, 160_160_128=false, 32_160_160=false, 0_64_0=false, 32_192_192=false, 160_96_128=false, 96_192_192=false, 32_224_224=true, 192_128_0=false, 128_64_96=false, 192_64_96=false, 96_224_224=true, 0_224_224=true, 128_64_224=false, 64_128_160=false, 224_128_224=false, 160_32_160=false, 32_192_160=false, 32_96_224=true, 192_224_160=false, 64_96_0=false, 128_224_192=false, 96_192_96=false, 64_128_96=false, 0_96_64=false, 160_192_64=false, 64_160_128=false, 0_32_128=true, 192_192_0=false, 64_224_0=false, 96_64_64=false, 192_128_160=false, 0_160_0=false, 0_192_192=false, 96_224_128=false, 128_32_64=false, 0_64_32=false, 32_64_224=true, 0_224_128=false, 160_64_160=false, 96_128_128=false, 96_224_96=false, 0_64_128=true, 32_32_224=true, 128_224_0=false, 64_224_192=false, 224_128_128=false, 64_32_160=true, 192_32_32=false, 224_224_96=false, 128_0_224=false, 0_0_96=true, 192_64_0=false, 160_192_0=false, 96_160_32=false, 128_32_224=false, 128_160_64=false, 192_128_32=false, 160_128_224=false, 224_224_224=false, 128_96_160=false, 32_160_224=true, 192_224_0=false, 224_0_160=false, 192_32_64=false, 64_96_96=false, 160_32_192=false, 64_32_224=true, 224_128_64=false, 32_64_128=true, 160_96_32=false, 64_0_32=false, 0_128_96=false, 0_64_96=false, 96_128_224=true, 192_64_192=false, 160_128_0=false, 192_160_224=false, 32_128_224=true, 0_192_160=false, 160_0_96=false, 160_128_64=false, 224_128_160=false, 0_128_0=false, 224_128_32=false, 0_64_64=false, 160_0_0=false, 224_160_160=false, 128_32_128=false, 96_192_160=false, 32_224_32=false, 32_160_128=false, 224_64_0=false, 160_64_96=false, 32_0_192=true, 192_224_64=false, 0_32_32=false, 128_96_0=false, 96_0_224=true, 160_160_224=false, 192_160_96=false, 64_32_128=true, 96_32_224=true, 160_32_32=false, 128_96_192=false, 0_192_0=false, 224_0_192=false, 192_160_128=false, 32_128_128=false, 96_96_160=true, 32_128_96=false, 96_192_224=true, 0_224_192=false, 224_128_96=false, 128_192_96=false, 32_0_64=false, 224_64_224=false, 160_96_64=false, 160_160_96=false, 192_224_224=false, 224_160_224=false, 0_192_224=true, 128_96_128=false, 192_64_160=false, 64_96_32=false, 96_96_224=true, 160_160_0=false, 160_0_64=false, 128_192_192=false, 96_32_128=false, 192_96_0=false, 224_128_192=false, 96_224_0=false, 64_224_128=false, 128_128_224=false, 128_160_32=false, 32_64_160=true, 192_128_64=false, 96_224_192=false, 160_64_64=false, 192_224_32=false, 192_32_96=false, 224_96_32=false, 64_96_64=false, 128_32_160=false, 0_32_0=false, 0_224_0=false, 96_96_0=false, 64_64_32=false, 192_0_224=false, 32_64_192=true, 192_128_96=false, 0_192_128=false, 96_0_0=false, 160_128_128=false, 224_160_128=false, 0_32_64=false, 96_96_128=false, 0_224_96=false, 160_128_32=false, 128_192_64=false, 96_32_96=false, 32_0_96=true, 64_224_224=true, 192_64_128=false, 64_160_0=false, 224_64_128=false, 32_128_160=false, 32_224_64=false, 32_0_0=false, 160_96_96=false, 192_160_160=false, 224_96_0=false, 96_192_128=false, 32_0_160=true, 128_0_128=false"),
    YELLOW("192_192_128=true, 192_160_64=true, 224_192_64=true, 192_192_32=true, 192_192_96=true, 224_224_0=true, 224_160_96=true, 224_192_128=true, 224_160_32=true, 192_192_160=true, 224_192_160=true, 192_128_32=true, 224_160_0=true, 192_224_0=true, 224_224_64=true, 192_192_0=true, 192_224_64=true, 224_224_160=true, 160_160_0=true, 224_192_32=true, 160_128_32=true, 192_160_96=true, 192_192_64=true, 224_192_96=true, 224_224_128=true, 192_160_32=true, 224_160_64=true, 224_192_0=true, 224_224_32=true, 192_160_128=true, 192_160_0=true, 224_224_96=true, 160_128_0=true, 224_224_192=true"),
    ;

    static final int SHIFT=32;
    boolean vals[][][] = new boolean[8][8][8];
    ColorSet(String str){
        parse(vals, str);
    }

    boolean match(RGBi pixel){
        return vals[pixel.r/SHIFT][pixel.g/SHIFT][pixel.b/SHIFT];
    }


    static void parse(boolean[][][] dest, String src){
        Set<String> srcSet = new HashSet<String>(Arrays.asList(src.split("[, ]+")));

        for( int r=0; r<255; r+=SHIFT){
            for( int g=0; g<255; g+=SHIFT){
                for( int b=0; b<255; b+=SHIFT){
                    String key = r+"_"+g+"_"+b;
                    if( srcSet.contains(key+"=true") ){
                        dest[r/SHIFT][g/SHIFT][b/SHIFT] = true;
                    }
                }
            }
        }
    }

}
