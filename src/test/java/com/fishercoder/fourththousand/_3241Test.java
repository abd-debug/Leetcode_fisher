package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3241;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3241Test {
    private _3241.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3241.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {4, 6, 3, 5, 5},
                solution1.timeTaken(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[2,4],[0,1],[2,3],[0,2]")));
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new int[] {
                    21, 23, 21, 23, 24, 26, 24, 26, 26, 27, 23, 26, 25, 24, 27, 27, 25, 23, 24, 28,
                    23, 24, 25, 27, 23, 28, 26, 28, 26, 24, 27, 29, 28, 26, 28, 29, 26, 30, 29, 25,
                    23, 25, 27, 31, 25, 30, 30, 29, 23, 23, 25, 26, 23, 29, 32, 27, 30, 30, 28, 30,
                    31, 31, 27, 31, 24, 29, 30, 29, 24, 26, 25, 26, 28, 26, 27, 24, 32, 24, 27, 30,
                    27, 30, 23, 33, 25, 29, 27, 29, 27, 29, 27, 25, 34, 30, 27, 23, 24, 26, 26, 25,
                    30, 30, 27, 27, 26, 31, 30, 23, 25, 27, 26, 26, 29, 26, 31, 30, 33, 26, 25, 27,
                    30, 32, 32, 28, 29, 31, 34, 27, 27, 34, 30, 28, 25, 30, 32, 24, 34, 30, 29, 26,
                    31, 27, 28, 28, 26, 26, 25, 32, 29, 27, 25, 27, 28, 27, 31, 32, 34, 33, 26, 25,
                    33, 25, 29, 28, 29, 29, 27, 36, 31, 25, 24, 27, 28, 35, 34, 26, 33, 30, 25, 28,
                    31, 25, 32, 34, 35, 25, 36, 27, 28, 33, 27, 33, 24, 27, 25, 33, 28, 32, 29, 28,
                    35, 24, 33, 31, 27, 26, 25, 28, 33, 27, 37, 28, 32, 31, 31, 29, 28, 25, 29, 28,
                    36, 30, 31, 29, 29, 32, 29, 32, 26, 26, 34, 27, 24, 29, 28, 32, 25, 38, 33, 26,
                    38, 29, 29, 32, 33, 27, 27, 32, 28, 30, 27, 28, 32, 31, 27, 30, 27, 25, 31, 32,
                    31, 30, 31, 35, 26, 27, 27, 25, 31, 27, 30, 26, 28, 30, 26, 39, 33, 33, 26, 26,
                    33, 30, 31, 36, 27, 31, 33, 31, 26, 27, 31, 29, 27, 28, 31, 29, 34, 33, 34, 30,
                    31, 27, 39, 38, 29, 33, 24, 26, 28, 24, 32, 28, 31, 36, 27, 31, 29, 29, 30, 24,
                    31, 27, 29, 31, 30, 28, 34, 35, 31, 31, 37, 31, 32, 28, 27, 25, 24, 23, 28, 36,
                    24, 36, 33, 36, 32, 28, 27, 36, 29, 31, 33, 30, 31, 33, 33, 35, 31, 34, 28, 28,
                    34, 31, 33, 34, 28, 29, 27, 31, 29, 27, 33, 29, 25, 28, 29, 37, 34, 29, 31, 28,
                    30, 38, 35, 27, 26, 34, 37, 27, 33, 39, 29, 40, 30, 33, 29, 28, 29, 29, 30, 29,
                    31, 35, 30, 23, 35, 28, 28, 26, 25, 31, 30, 30, 26, 27, 33, 28, 28, 29, 30, 32,
                    28, 36, 31, 31, 26, 35, 32, 27, 29, 39, 32, 34, 36, 28, 27, 32, 29, 33, 36, 30,
                    25, 25, 27, 31, 31, 32, 34, 32, 36, 27, 26, 30, 28, 31, 27, 31, 35, 32, 33, 26,
                    32, 30, 25, 33, 31, 28, 35, 32, 27, 32, 27, 32, 37, 30, 28, 26, 28, 29, 31, 29,
                    34, 33, 26, 25, 29, 29, 27, 31, 28, 31, 35, 32, 28, 29, 26, 31, 30, 39, 23, 28,
                    30, 33, 30, 24, 32, 34, 34, 34, 27, 26, 31, 31, 25, 26, 30, 30, 36, 30, 34, 26,
                    29, 34, 28, 28, 32, 30, 28, 31, 31, 32, 26, 31, 26, 29, 29, 35, 32, 29, 26, 29,
                    34, 28, 24, 34, 29, 26, 30, 30, 35, 34, 28, 30, 25, 30, 31, 31, 33, 27, 30, 30,
                    33, 30, 36, 31, 31, 29, 29, 34, 32, 33, 28, 35, 32, 28, 28, 30, 29, 34, 36, 31,
                    38, 32, 35, 36, 30, 29, 30, 31, 30, 27, 28, 29, 27, 31, 27, 31, 25, 33, 33, 31,
                    27, 29, 32, 32, 29, 25, 30, 34, 35, 31, 33, 35, 33, 26, 25, 30, 26, 34, 40, 29,
                    25, 27, 32, 32, 36, 37, 32, 31, 31, 27, 37, 35, 35, 31, 30, 29, 34, 27, 31, 37,
                    29, 27, 31, 28, 34, 31, 28, 31, 30, 37, 34, 32, 38, 31, 30, 33, 29, 37, 30, 28,
                    32, 34, 35, 31, 29, 23, 28, 26, 32, 35, 31, 28, 32, 29, 30, 30, 35, 40, 35, 36,
                    32, 26, 36, 32, 30, 24, 30, 31, 27, 38, 30, 27, 29, 35, 36, 34, 32, 30, 28, 32,
                    27, 27, 26, 35, 35, 29, 33, 31, 28, 32, 32, 25, 27, 27, 31, 31, 28, 29, 36, 30,
                    28, 30, 29, 32, 32, 33, 30, 33, 37, 38, 28, 30, 32, 34, 29, 30, 27, 26, 25, 36,
                    27, 31, 29, 30, 28, 32, 30, 34, 37, 25, 28, 30, 27, 37, 27, 29, 24, 33, 31, 27,
                    35, 29, 40, 32
                },
                solution1.timeTaken(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[159,24],[446,195],[38,14],[36,6],[222,93],[427,50],[604,292],[667,181],[197,66],[247,43],[175,91],[738,503],[251,15],[639,184],[262,79],[535,176],[162,94],[310,106],[445,398],[55,11],[318,65],[516,174],[223,74],[539,74],[624,326],[151,22],[509,39],[383,117],[363,297],[690,590],[452,28],[694,92],[188,28],[41,24],[579,575],[620,24],[725,140],[474,383],[5,4],[471,61],[365,25],[331,177],[640,508],[368,334],[469,423],[467,213],[68,3],[246,205],[214,112],[585,415],[100,34],[403,2],[633,37],[1,0],[629,50],[221,152],[695,54],[238,60],[512,40],[727,114],[420,289],[317,42],[37,31],[282,221],[686,89],[391,275],[105,37],[379,36],[174,122],[244,180],[502,397],[43,38],[500,172],[266,239],[352,57],[426,315],[572,398],[191,121],[483,319],[411,67],[461,31],[429,303],[423,162],[614,319],[437,214],[649,339],[270,89],[264,96],[361,112],[711,21],[739,703],[581,270],[556,155],[290,221],[612,147],[200,129],[393,114],[346,145],[115,32],[677,240],[71,4],[593,37],[325,26],[636,501],[179,15],[335,20],[601,284],[170,49],[204,69],[268,177],[651,410],[141,69],[717,211],[17,0],[249,89],[372,135],[510,461],[97,91],[599,517],[546,533],[133,53],[64,17],[360,134],[261,165],[652,375],[185,21],[643,321],[80,73],[733,626],[436,128],[202,147],[501,147],[330,184],[410,188],[327,244],[497,330],[656,434],[621,279],[158,6],[448,355],[631,612],[626,105],[257,13],[136,76],[718,174],[728,343],[54,43],[607,54],[395,8],[24,2],[373,209],[466,276],[333,151],[753,343],[178,24],[699,495],[648,585],[580,516],[91,48],[301,205],[550,127],[28,6],[83,60],[171,139],[529,487],[82,0],[465,321],[606,493],[687,124],[58,26],[544,433],[329,218],[72,26],[569,180],[737,68],[441,48],[534,292],[697,479],[413,117],[647,575],[710,584],[573,450],[577,460],[416,321],[732,687],[109,5],[189,121],[10,2],[48,2],[145,91],[504,63],[565,379],[491,418],[487,396],[16,13],[519,336],[683,329],[706,247],[531,93],[594,118],[459,161],[463,258],[618,275],[29,1],[563,261],[554,101],[653,561],[750,424],[207,55],[193,146],[138,74],[762,389],[315,101],[560,378],[381,186],[34,23],[507,54],[700,513],[302,237],[680,318],[722,594],[392,317],[488,28],[405,171],[272,158],[78,33],[67,19],[46,32],[583,446],[713,667],[47,14],[730,109],[576,94],[708,701],[693,617],[275,237],[107,0],[553,234],[157,114],[86,73],[271,267],[324,223],[482,185],[755,465],[460,453],[98,68],[578,298],[305,227],[322,74],[745,367],[172,158],[468,108],[595,525],[477,251],[253,221],[338,228],[194,21],[239,41],[183,83],[337,0],[503,337],[49,2],[528,124],[688,681],[545,68],[674,406],[558,377],[417,395],[490,362],[232,17],[386,313],[525,338],[50,29],[359,144],[350,227],[298,122],[51,4],[340,107],[527,299],[18,17],[664,359],[137,32],[388,260],[645,544],[21,1],[440,10],[740,229],[209,97],[366,229],[377,254],[334,12],[14,7],[723,61],[358,26],[409,351],[513,267],[142,110],[407,306],[349,316],[106,87],[94,73],[470,111],[40,2],[240,220],[353,262],[613,161],[242,25],[705,465],[757,300],[684,416],[715,81],[224,74],[380,65],[227,106],[591,90],[149,12],[744,494],[99,40],[284,7],[27,15],[655,638],[35,14],[586,295],[123,98],[742,256],[85,42],[12,10],[165,143],[456,116],[716,171],[116,60],[139,96],[760,706],[627,390],[367,351],[518,463],[743,492],[203,38],[498,2],[313,136],[536,213],[729,639],[375,283],[387,12],[752,117],[273,47],[419,105],[296,122],[511,436],[720,127],[356,81],[508,459],[147,63],[70,29],[486,84],[540,134],[23,11],[124,25],[492,109],[213,148],[390,190],[679,174],[592,139],[431,252],[182,46],[76,61],[254,44],[754,408],[523,301],[364,321],[153,16],[198,123],[286,214],[551,522],[102,12],[736,614],[120,67],[644,195],[161,135],[45,31],[548,507],[241,131],[278,257],[280,154],[567,481],[332,270],[279,6],[543,344],[682,376],[297,258],[382,276],[160,155],[533,345],[252,46],[168,57],[33,18],[394,62],[600,175],[245,117],[291,123],[678,370],[537,207],[662,202],[630,582],[31,27],[538,18],[205,64],[596,48],[685,107],[92,54],[761,736],[668,511],[231,113],[354,60],[433,15],[587,112],[89,30],[439,87],[698,171],[464,451],[444,133],[84,82],[616,335],[559,477],[378,351],[473,58],[235,105],[265,11],[228,169],[57,47],[721,34],[113,6],[114,93],[605,82],[166,11],[236,20],[692,334],[476,98],[432,156],[362,225],[495,115],[2,0],[568,318],[300,148],[707,224],[263,208],[701,175],[385,212],[564,368],[135,3],[619,256],[347,156],[637,146],[402,377],[530,257],[401,357],[293,269],[132,52],[499,28],[449,97],[526,15],[494,64],[309,107],[140,45],[196,9],[52,0],[260,45],[74,7],[304,246],[422,221],[541,384],[622,586],[326,157],[177,65],[164,88],[515,152],[44,40],[169,52],[125,112],[428,102],[646,9],[756,1],[443,322],[675,492],[371,204],[167,156],[13,3],[20,0],[308,231],[749,24],[597,447],[670,281],[243,130],[478,177],[7,6],[584,215],[234,23],[602,253],[219,104],[62,11],[4,3],[303,220],[735,570],[9,7],[186,156],[126,122],[19,9],[220,174],[634,291],[173,129],[520,94],[30,12],[557,407],[588,479],[299,31],[128,71],[480,252],[598,400],[672,546],[726,223],[22,20],[425,370],[342,243],[574,269],[181,13],[625,167],[481,444],[95,2],[289,51],[215,128],[104,68],[281,272],[127,71],[343,230],[163,55],[505,54],[638,322],[681,161],[712,97],[201,107],[561,142],[575,308],[39,20],[562,174],[724,46],[384,306],[657,343],[190,150],[493,345],[517,420],[719,34],[665,0],[152,151],[661,252],[134,105],[285,162],[288,6],[287,261],[450,96],[748,347],[187,132],[746,295],[348,74],[341,298],[714,664],[77,17],[216,119],[294,112],[611,342],[399,74],[184,116],[110,18],[63,45],[255,223],[571,244],[642,517],[111,99],[60,38],[650,344],[319,3],[430,120],[206,77],[454,146],[659,28],[357,305],[6,1],[320,81],[370,214],[566,90],[704,342],[696,361],[555,461],[458,457],[457,213],[61,59],[462,29],[609,198],[376,122],[259,105],[344,105],[156,54],[90,84],[485,284],[122,105],[666,530],[218,62],[230,195],[119,33],[11,4],[731,666],[603,527],[88,5],[339,230],[691,73],[396,293],[734,600],[484,251],[702,6],[42,5],[237,220],[69,4],[208,121],[336,3],[521,54],[8,6],[129,54],[121,100],[763,66],[398,34],[3,2],[408,29],[703,176],[277,225],[112,30],[146,20],[532,18],[590,109],[87,74],[397,88],[154,124],[195,154],[522,289],[199,119],[226,86],[15,5],[211,110],[496,241],[658,493],[258,242],[758,575],[210,200],[628,553],[615,377],[225,56],[323,304],[73,64],[56,34],[673,334],[314,5],[144,4],[438,296],[248,187],[617,536],[274,39],[267,75],[311,289],[747,310],[96,95],[751,705],[689,186],[180,59],[176,154],[475,232],[316,293],[447,253],[65,30],[623,558],[81,72],[307,306],[75,1],[489,115],[66,31],[229,169],[663,374],[117,39],[547,291],[424,170],[150,77],[256,11],[524,489],[269,22],[741,281],[654,591],[118,77],[283,126],[276,168],[295,211],[131,15],[418,142],[25,9],[669,342],[412,181],[570,269],[155,100],[514,364],[292,16],[451,215],[321,145],[93,87],[355,202],[709,527],[130,47],[506,426],[415,8],[59,32],[389,210],[250,44],[328,148],[143,36],[312,304],[404,238],[552,498],[435,409],[103,44],[759,139],[212,106],[53,25],[148,131],[192,17],[660,558],[400,81],[610,528],[217,40],[635,334],[479,325],[306,107],[582,521],[589,113],[542,49],[608,276],[406,321],[641,118],[108,77],[79,47],[101,31],[26,6],[549,305],[632,607],[421,298],[32,15],[472,456],[453,59],[345,187],[374,284],[233,166],[414,225],[671,629],[351,165],[676,431],[455,218],[434,97],[442,69],[369,175]")));
    }
}