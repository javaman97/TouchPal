package p100m.framework.p103ui.widget.viewpager;

import android.view.animation.Interpolator;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: m.framework.ui.widget.viewpager.b */
/* compiled from: ViewPagerClassic */
class C4330b implements Interpolator {

    /* renamed from: a */
    float[] f17588a;

    /* renamed from: b */
    final /* synthetic */ ViewPagerClassic f17589b;

    C4330b(ViewPagerClassic viewPagerClassic) {
        this.f17589b = viewPagerClassic;
        float[] fArr = new float[Settings.HANDWRITE_WIDTH];
        // fill-array-data instruction
        fArr[0] = 0;
        fArr[1] = 1015065752;
        fArr[2] = 1023453340;
        fArr[3] = 1027666623;
        fArr[4] = 1031837774;
        fArr[5] = 1033940778;
        fArr[6] = 1036041178;
        fArr[7] = 1038138424;
        fArr[8] = 1040209739;
        fArr[9] = 1041254490;
        fArr[10] = 1042296892;
        fArr[11] = 1043336744;
        fArr[12] = 1044373710;
        fArr[13] = 1045407589;
        fArr[14] = 1046438113;
        fArr[15] = 1047465013;
        fArr[16] = 1048488087;
        fArr[17] = 1049041501;
        fArr[18] = 1049548777;
        fArr[19] = 1050053737;
        fArr[20] = 1050556282;
        fArr[21] = 1051056243;
        fArr[22] = 1051553553;
        fArr[23] = 1052048045;
        fArr[24] = 1052539617;
        fArr[25] = 1053028103;
        fArr[26] = 1053513468;
        fArr[27] = 1053995511;
        fArr[28] = 1054474165;
        fArr[29] = 1054949295;
        fArr[30] = 1055420769;
        fArr[31] = 1055888517;
        fArr[32] = 1056352374;
        fArr[33] = 1056812237;
        fArr[34] = 1057116291;
        fArr[35] = 1057342079;
        fArr[36] = 1057565685;
        fArr[37] = 1057787077;
        fArr[38] = 1058006188;
        fArr[39] = 1058222983;
        fArr[40] = 1058437396;
        fArr[41] = 1058649376;
        fArr[42] = 1058858873;
        fArr[43] = 1059065837;
        fArr[44] = 1059270200;
        fArr[45] = 1059471929;
        fArr[46] = 1059670974;
        fArr[47] = 1059867284;
        fArr[48] = 1060060793;
        fArr[49] = 1060251483;
        fArr[50] = 1060439287;
        fArr[51] = 1060624155;
        fArr[52] = 1060806070;
        fArr[53] = 1060984949;
        fArr[54] = 1061160774;
        fArr[55] = 1061333496;
        fArr[56] = 1061503063;
        fArr[57] = 1061669443;
        fArr[58] = 1061832601;
        fArr[59] = 1061992488;
        fArr[60] = 1062149053;
        fArr[61] = 1062302279;
        fArr[62] = 1062452117;
        fArr[63] = 1062598515;
        fArr[64] = 1062741473;
        fArr[65] = 1062880925;
        fArr[66] = 1063016854;
        fArr[67] = 1063149227;
        fArr[68] = 1063277992;
        fArr[69] = 1063403133;
        fArr[70] = 1063524617;
        fArr[71] = 1063642410;
        fArr[72] = 1063756478;
        fArr[73] = 1063866805;
        fArr[74] = 1063973374;
        fArr[75] = 1064076134;
        fArr[76] = 1064175053;
        fArr[77] = 1064270146;
        fArr[78] = 1064361364;
        fArr[79] = 1064448672;
        fArr[80] = 1064532089;
        fArr[81] = 1064611546;
        fArr[82] = 1064687060;
        fArr[83] = 1064758581;
        fArr[84] = 1064826126;
        fArr[85] = 1064889662;
        fArr[86] = 1064949170;
        fArr[87] = 1065004636;
        fArr[88] = 1065056041;
        fArr[89] = 1065103386;
        fArr[90] = 1065146655;
        fArr[91] = 1065185846;
        fArr[92] = 1065220928;
        fArr[93] = 1065251898;
        fArr[94] = 1065278759;
        fArr[95] = 1065301492;
        fArr[96] = 1065320115;
        fArr[97] = 1065334593;
        fArr[98] = 1065344945;
        fArr[99] = 1065351152;
        fArr[100] = 1065353216;
        this.f17588a = fArr;
    }

    public float getInterpolation(float f) {
        return this.f17588a[(int) (100.0f * f)];
    }
}
