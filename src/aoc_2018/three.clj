(ns aoc-2018.three)

(def claims
  ["#1 @ 432,394: 29x14"
   "#2 @ 57,42: 12x16"
   "#3 @ 138,913: 22x20"
   "#4 @ 976,493: 24x21"
   "#5 @ 500,963: 12x16"
   "#6 @ 737,354: 17x21"
   "#7 @ 817,143: 21x16"
   "#8 @ 229,448: 13x14"
   "#9 @ 340,634: 16x24"
   "#10 @ 86,98: 24x16"
   "#11 @ 633,432: 25x18"
   "#12 @ 454,37: 14x16"
   "#13 @ 443,691: 23x26"
   "#14 @ 279,76: 17x24"
   "#15 @ 905,833: 13x22"
   "#16 @ 530,601: 10x28"
   "#17 @ 79,274: 16x24"
   "#18 @ 698,849: 18x25"
   "#19 @ 88,851: 17x11"
   "#20 @ 560,132: 11x21"
   "#21 @ 105,909: 20x23"
   "#22 @ 408,958: 15x18"
   "#23 @ 383,951: 20x26"
   "#24 @ 438,694: 23x25"
   "#25 @ 12,934: 13x20"
   "#26 @ 268,134: 23x22"
   "#27 @ 375,503: 20x18"
   "#28 @ 466,480: 15x10"
   "#29 @ 624,126: 11x26"
   "#30 @ 558,63: 18x12"
   "#31 @ 163,768: 19x17"
   "#32 @ 226,971: 20x10"
   "#33 @ 943,782: 11x10"
   "#34 @ 84,970: 12x26"
   "#35 @ 298,872: 12x10"
   "#36 @ 315,283: 18x18"
   "#37 @ 888,514: 13x25"
   "#38 @ 359,32: 18x21"
   "#39 @ 304,940: 20x26"
   "#40 @ 471,911: 26x16"
   "#41 @ 278,245: 11x11"
   "#42 @ 540,156: 21x27"
   "#43 @ 32,62: 20x11"
   "#44 @ 11,148: 20x21"
   "#45 @ 123,87: 20x17"
   "#46 @ 895,262: 26x21"
   "#47 @ 574,146: 28x15"
   "#48 @ 681,185: 24x19"
   "#49 @ 106,563: 25x18"
   "#50 @ 718,864: 26x16"
   "#51 @ 956,52: 11x27"
   "#52 @ 370,436: 23x28"
   "#53 @ 445,473: 12x24"
   "#54 @ 335,687: 26x19"
   "#55 @ 782,264: 19x14"
   "#56 @ 899,199: 22x18"
   "#57 @ 512,748: 20x10"
   "#58 @ 93,225: 19x15"
   "#59 @ 352,619: 19x21"
   "#60 @ 594,769: 16x25"
   "#61 @ 187,581: 15x17"
   "#62 @ 414,15: 21x16"
   "#63 @ 704,571: 13x26"
   "#64 @ 576,323: 24x19"
   "#65 @ 264,400: 21x14"
   "#66 @ 484,966: 22x22"
   "#67 @ 82,317: 22x13"
   "#68 @ 745,550: 22x26"
   "#69 @ 553,768: 18x26"
   "#70 @ 293,287: 29x29"
   "#71 @ 310,303: 26x19"
   "#72 @ 102,153: 24x23"
   "#73 @ 398,901: 7x7"
   "#74 @ 926,49: 16x20"
   "#75 @ 174,762: 13x10"
   "#76 @ 272,586: 12x18"
   "#77 @ 278,409: 28x20"
   "#78 @ 428,638: 13x13"
   "#79 @ 783,679: 11x18"
   "#80 @ 922,167: 21x10"
   "#81 @ 470,155: 13x24"
   "#82 @ 456,763: 20x24"
   "#83 @ 467,519: 19x21"
   "#84 @ 624,407: 21x17"
   "#85 @ 102,965: 11x12"
   "#86 @ 191,779: 14x11"
   "#87 @ 716,265: 28x28"
   "#88 @ 848,564: 19x19"
   "#89 @ 45,754: 15x16"
   "#90 @ 749,365: 19x25"
   "#91 @ 361,883: 23x25"
   "#92 @ 236,645: 29x25"
   "#93 @ 530,317: 12x19"
   "#94 @ 915,876: 12x12"
   "#95 @ 374,246: 15x20"
   "#96 @ 164,810: 26x18"
   "#97 @ 146,480: 22x17"
   "#98 @ 422,540: 23x12"
   "#99 @ 43,148: 13x29"
   "#100 @ 249,325: 29x24"
   "#101 @ 301,940: 17x10"
   "#102 @ 186,327: 18x18"
   "#103 @ 915,112: 21x21"
   "#104 @ 719,449: 22x29"
   "#105 @ 900,329: 17x25"
   "#106 @ 662,72: 19x14"
   "#107 @ 203,589: 10x15"
   "#108 @ 24,211: 15x17"
   "#109 @ 844,439: 10x19"
   "#110 @ 792,132: 20x12"
   "#111 @ 64,885: 19x24"
   "#112 @ 892,923: 25x27"
   "#113 @ 254,454: 29x22"
   "#114 @ 396,218: 12x15"
   "#115 @ 963,429: 17x16"
   "#116 @ 907,513: 21x26"
   "#117 @ 868,531: 24x13"
   "#118 @ 924,884: 13x29"
   "#119 @ 243,603: 25x24"
   "#120 @ 973,787: 14x3"
   "#121 @ 298,722: 19x11"
   "#122 @ 307,873: 17x26"
   "#123 @ 532,900: 15x20"
   "#124 @ 24,104: 22x29"
   "#125 @ 621,883: 21x13"
   "#126 @ 387,903: 17x26"
   "#127 @ 953,48: 17x12"
   "#128 @ 172,138: 13x19"
   "#129 @ 370,861: 18x11"
   "#130 @ 366,514: 20x27"
   "#131 @ 325,673: 12x14"
   "#132 @ 280,862: 22x13"
   "#133 @ 716,11: 15x23"
   "#134 @ 734,193: 4x3"
   "#135 @ 337,362: 24x15"
   "#136 @ 27,357: 27x15"
   "#137 @ 930,197: 27x14"
   "#138 @ 541,2: 15x16"
   "#139 @ 4,578: 26x25"
   "#140 @ 834,781: 15x24"
   "#141 @ 637,730: 11x10"
   "#142 @ 38,502: 26x28"
   "#143 @ 485,756: 15x29"
   "#144 @ 416,203: 11x24"
   "#145 @ 616,499: 23x27"
   "#146 @ 156,861: 12x22"
   "#147 @ 464,32: 23x22"
   "#148 @ 274,133: 11x27"
   "#149 @ 945,545: 24x25"
   "#150 @ 599,356: 16x22"
   "#151 @ 560,94: 24x26"
   "#152 @ 734,853: 16x24"
   "#153 @ 370,127: 23x23"
   "#154 @ 464,388: 10x13"
   "#155 @ 607,761: 25x16"
   "#156 @ 366,346: 10x27"
   "#157 @ 817,713: 26x22"
   "#158 @ 776,468: 18x28"
   "#159 @ 737,859: 13x19"
   "#160 @ 524,540: 29x28"
   "#161 @ 50,34: 15x25"
   "#162 @ 465,835: 10x10"
   "#163 @ 305,641: 10x11"
   "#164 @ 301,87: 6x16"
   "#165 @ 151,484: 28x22"
   "#166 @ 326,481: 16x12"
   "#167 @ 502,350: 25x18"
   "#168 @ 361,214: 17x22"
   "#169 @ 45,166: 19x12"
   "#170 @ 833,79: 17x10"
   "#171 @ 419,524: 18x22"
   "#172 @ 340,469: 28x22"
   "#173 @ 157,206: 19x20"
   "#174 @ 510,741: 17x20"
   "#175 @ 450,455: 19x23"
   "#176 @ 325,42: 10x21"
   "#177 @ 411,218: 18x19"
   "#178 @ 513,751: 12x18"
   "#179 @ 152,314: 23x14"
   "#180 @ 677,702: 25x14"
   "#181 @ 8,774: 16x20"
   "#182 @ 539,236: 12x18"
   "#183 @ 63,681: 20x17"
   "#184 @ 839,388: 22x24"
   "#185 @ 177,969: 20x28"
   "#186 @ 389,606: 22x15"
   "#187 @ 70,643: 12x29"
   "#188 @ 849,858: 23x28"
   "#189 @ 795,93: 13x11"
   "#190 @ 188,592: 18x26"
   "#191 @ 676,808: 10x16"
   "#192 @ 494,898: 18x25"
   "#193 @ 21,369: 10x13"
   "#194 @ 52,415: 23x18"
   "#195 @ 375,316: 21x26"
   "#196 @ 869,673: 25x18"
   "#197 @ 53,886: 28x27"
   "#198 @ 911,711: 27x18"
   "#199 @ 10,61: 27x12"
   "#200 @ 648,364: 17x15"
   "#201 @ 902,343: 18x29"
   "#202 @ 103,236: 14x17"
   "#203 @ 398,223: 5x5"
   "#204 @ 445,496: 15x27"
   "#205 @ 297,303: 11x28"
   "#206 @ 127,27: 10x26"
   "#207 @ 732,188: 15x12"
   "#208 @ 288,451: 18x26"
   "#209 @ 298,183: 25x23"
   "#210 @ 88,947: 25x27"
   "#211 @ 400,880: 13x15"
   "#212 @ 227,286: 14x13"
   "#213 @ 357,111: 28x13"
   "#214 @ 744,591: 13x28"
   "#215 @ 903,376: 28x22"
   "#216 @ 377,723: 15x18"
   "#217 @ 189,867: 11x20"
   "#218 @ 74,471: 21x26"
   "#219 @ 356,547: 14x17"
   "#220 @ 800,190: 22x11"
   "#221 @ 223,267: 4x14"
   "#222 @ 167,866: 26x23"
   "#223 @ 131,966: 20x21"
   "#224 @ 951,264: 26x24"
   "#225 @ 73,185: 11x16"
   "#226 @ 552,844: 17x28"
   "#227 @ 327,359: 25x25"
   "#228 @ 971,926: 14x21"
   "#229 @ 819,283: 10x17"
   "#230 @ 343,32: 19x18"
   "#231 @ 658,71: 19x27"
   "#232 @ 463,551: 11x29"
   "#233 @ 833,221: 14x16"
   "#234 @ 747,954: 16x13"
   "#235 @ 358,352: 19x24"
   "#236 @ 309,626: 29x23"
   "#237 @ 273,211: 20x17"
   "#238 @ 716,310: 14x6"
   "#239 @ 444,108: 15x21"
   "#240 @ 54,902: 26x26"
   "#241 @ 274,490: 12x27"
   "#242 @ 621,299: 25x20"
   "#243 @ 919,56: 10x25"
   "#244 @ 18,671: 24x20"
   "#245 @ 176,807: 12x12"
   "#246 @ 389,970: 14x10"
   "#247 @ 45,42: 25x19"
   "#248 @ 56,399: 26x22"
   "#249 @ 180,808: 27x12"
   "#250 @ 823,157: 22x27"
   "#251 @ 665,77: 17x14"
   "#252 @ 3,697: 20x15"
   "#253 @ 577,226: 27x11"
   "#254 @ 79,402: 20x13"
   "#255 @ 915,370: 19x29"
   "#256 @ 570,272: 25x28"
   "#257 @ 962,75: 8x5"
   "#258 @ 4,539: 20x16"
   "#259 @ 482,760: 13x12"
   "#260 @ 700,820: 23x16"
   "#261 @ 615,355: 16x19"
   "#262 @ 297,868: 11x18"
   "#263 @ 383,899: 27x16"
   "#264 @ 293,956: 12x10"
   "#265 @ 320,594: 13x22"
   "#266 @ 488,681: 19x15"
   "#267 @ 548,882: 14x26"
   "#268 @ 348,833: 29x26"
   "#269 @ 454,357: 24x17"
   "#270 @ 2,541: 29x25"
   "#271 @ 969,425: 21x13"
   "#272 @ 220,428: 10x15"
   "#273 @ 586,291: 19x14"
   "#274 @ 93,64: 24x27"
   "#275 @ 172,776: 18x10"
   "#276 @ 649,132: 21x29"
   "#277 @ 14,137: 29x17"
   "#278 @ 302,866: 19x17"
   "#279 @ 288,329: 24x17"
   "#280 @ 819,173: 27x16"
   "#281 @ 231,56: 10x29"
   "#282 @ 914,103: 23x11"
   "#283 @ 711,155: 11x11"
   "#284 @ 673,590: 16x23"
   "#285 @ 63,178: 20x17"
   "#286 @ 842,800: 12x21"
   "#287 @ 302,973: 20x17"
   "#288 @ 946,595: 11x18"
   "#289 @ 546,691: 17x26"
   "#290 @ 560,896: 27x26"
   "#291 @ 751,208: 13x26"
   "#292 @ 665,68: 12x14"
   "#293 @ 326,284: 27x16"
   "#294 @ 633,609: 24x16"
   "#295 @ 432,725: 20x24"
   "#296 @ 623,560: 10x25"
   "#297 @ 301,270: 10x11"
   "#298 @ 587,113: 27x28"
   "#299 @ 232,534: 27x10"
   "#300 @ 261,87: 12x10"
   "#301 @ 758,300: 15x10"
   "#302 @ 430,722: 28x14"
   "#303 @ 135,0: 10x20"
   "#304 @ 743,883: 29x25"
   "#305 @ 544,677: 19x15"
   "#306 @ 101,400: 19x28"
   "#307 @ 262,366: 18x23"
   "#308 @ 729,234: 18x10"
   "#309 @ 3,146: 13x26"
   "#310 @ 963,916: 12x26"
   "#311 @ 265,453: 14x16"
   "#312 @ 573,25: 26x22"
   "#313 @ 847,516: 25x13"
   "#314 @ 189,335: 28x16"
   "#315 @ 716,595: 20x15"
   "#316 @ 79,801: 12x25"
   "#317 @ 785,702: 21x12"
   "#318 @ 102,9: 26x11"
   "#319 @ 593,785: 29x10"
   "#320 @ 450,877: 23x29"
   "#321 @ 163,236: 15x16"
   "#322 @ 934,192: 12x23"
   "#323 @ 338,942: 28x28"
   "#324 @ 789,10: 19x10"
   "#325 @ 292,61: 19x19"
   "#326 @ 11,834: 24x10"
   "#327 @ 157,283: 21x16"
   "#328 @ 212,959: 21x22"
   "#329 @ 639,579: 15x24"
   "#330 @ 696,560: 18x28"
   "#331 @ 73,695: 20x13"
   "#332 @ 289,85: 23x21"
   "#333 @ 254,96: 16x27"
   "#334 @ 444,104: 11x23"
   "#335 @ 819,371: 25x29"
   "#336 @ 761,656: 27x29"
   "#337 @ 493,210: 10x14"
   "#338 @ 197,579: 21x25"
   "#339 @ 85,173: 15x24"
   "#340 @ 151,642: 22x10"
   "#341 @ 672,56: 24x21"
   "#342 @ 221,263: 26x25"
   "#343 @ 111,394: 11x10"
   "#344 @ 57,372: 27x28"
   "#345 @ 147,179: 14x29"
   "#346 @ 126,19: 25x13"
   "#347 @ 640,592: 11x15"
   "#348 @ 100,795: 22x23"
   "#349 @ 551,784: 27x11"
   "#350 @ 540,505: 18x11"
   "#351 @ 92,312: 19x19"
   "#352 @ 624,571: 15x16"
   "#353 @ 55,765: 14x22"
   "#354 @ 849,686: 23x13"
   "#355 @ 105,297: 25x28"
   "#356 @ 756,942: 10x16"
   "#357 @ 227,788: 13x25"
   "#358 @ 857,835: 28x23"
   "#359 @ 675,628: 27x20"
   "#360 @ 619,519: 14x19"
   "#361 @ 83,92: 25x24"
   "#362 @ 579,566: 21x10"
   "#363 @ 968,914: 20x21"
   "#364 @ 188,705: 20x20"
   "#365 @ 159,511: 24x16"
   "#366 @ 85,377: 14x15"
   "#367 @ 822,388: 18x4"
   "#368 @ 432,303: 23x11"
   "#369 @ 648,603: 28x19"
   "#370 @ 662,767: 24x26"
   "#371 @ 353,464: 12x11"
   "#372 @ 569,771: 22x27"
   "#373 @ 541,48: 18x11"
   "#374 @ 687,452: 15x10"
   "#375 @ 645,799: 19x15"
   "#376 @ 99,352: 14x23"
   "#377 @ 11,146: 25x22"
   "#378 @ 673,631: 15x23"
   "#379 @ 458,966: 29x28"
   "#380 @ 817,668: 25x16"
   "#381 @ 497,280: 14x29"
   "#382 @ 959,683: 16x18"
   "#383 @ 163,345: 12x19"
   "#384 @ 687,29: 29x10"
   "#385 @ 361,871: 24x12"
   "#386 @ 864,6: 28x18"
   "#387 @ 863,658: 10x25"
   "#388 @ 321,225: 16x23"
   "#389 @ 473,63: 27x24"
   "#390 @ 708,874: 12x17"
   "#391 @ 248,351: 14x20"
   "#392 @ 227,539: 14x22"
   "#393 @ 550,58: 11x20"
   "#394 @ 490,356: 10x15"
   "#395 @ 361,273: 18x21"
   "#396 @ 864,312: 26x29"
   "#397 @ 352,11: 17x22"
   "#398 @ 892,661: 26x29"
   "#399 @ 892,511: 15x5"
   "#400 @ 555,340: 22x26"
   "#401 @ 346,234: 15x27"
   "#402 @ 414,308: 28x11"
   "#403 @ 219,212: 28x29"
   "#404 @ 505,957: 26x18"
   "#405 @ 907,672: 28x16"
   "#406 @ 90,321: 25x23"
   "#407 @ 195,128: 10x27"
   "#408 @ 817,179: 10x20"
   "#409 @ 224,422: 22x21"
   "#410 @ 72,681: 29x17"
   "#411 @ 549,506: 18x23"
   "#412 @ 649,437: 14x10"
   "#413 @ 433,623: 14x20"
   "#414 @ 754,203: 14x23"
   "#415 @ 43,538: 20x15"
   "#416 @ 194,922: 27x25"
   "#417 @ 563,138: 16x24"
   "#418 @ 372,528: 17x29"
   "#419 @ 958,224: 16x26"
   "#420 @ 933,218: 12x14"
   "#421 @ 968,423: 20x21"
   "#422 @ 478,170: 26x16"
   "#423 @ 274,487: 10x21"
   "#424 @ 185,173: 20x12"
   "#425 @ 898,840: 11x13"
   "#426 @ 951,667: 3x5"
   "#427 @ 451,785: 28x17"
   "#428 @ 811,162: 23x29"
   "#429 @ 854,161: 20x15"
   "#430 @ 609,562: 14x18"
   "#431 @ 928,734: 18x26"
   "#432 @ 64,640: 24x24"
   "#433 @ 594,511: 27x12"
   "#434 @ 789,692: 13x10"
   "#435 @ 448,321: 25x21"
   "#436 @ 707,504: 18x28"
   "#437 @ 609,116: 19x11"
   "#438 @ 199,475: 21x27"
   "#439 @ 155,967: 20x16"
   "#440 @ 467,250: 19x29"
   "#441 @ 40,528: 18x22"
   "#442 @ 332,362: 17x24"
   "#443 @ 630,765: 27x19"
   "#444 @ 357,538: 21x10"
   "#445 @ 453,506: 6x5"
   "#446 @ 14,937: 10x21"
   "#447 @ 162,813: 21x10"
   "#448 @ 176,760: 19x20"
   "#449 @ 10,439: 16x27"
   "#450 @ 378,739: 23x17"
   "#451 @ 575,0: 10x21"
   "#452 @ 13,51: 22x26"
   "#453 @ 613,219: 11x23"
   "#454 @ 2,448: 18x16"
   "#455 @ 903,320: 16x14"
   "#456 @ 961,445: 13x20"
   "#457 @ 764,260: 29x16"
   "#458 @ 955,975: 12x12"
   "#459 @ 848,452: 17x23"
   "#460 @ 439,567: 28x15"
   "#461 @ 299,277: 23x28"
   "#462 @ 121,904: 16x19"
   "#463 @ 805,313: 11x12"
   "#464 @ 303,621: 27x22"
   "#465 @ 168,335: 11x13"
   "#466 @ 752,927: 22x16"
   "#467 @ 925,465: 14x17"
   "#468 @ 151,848: 10x29"
   "#469 @ 55,49: 14x11"
   "#470 @ 547,1: 14x17"
   "#471 @ 747,448: 18x23"
   "#472 @ 753,299: 11x25"
   "#473 @ 171,148: 28x17"
   "#474 @ 558,765: 23x22"
   "#475 @ 927,118: 12x20"
   "#476 @ 317,361: 13x11"
   "#477 @ 951,802: 10x24"
   "#478 @ 904,52: 17x21"
   "#479 @ 437,671: 29x25"
   "#480 @ 281,287: 10x22"
   "#481 @ 691,870: 21x28"
   "#482 @ 435,32: 22x10"
   "#483 @ 736,724: 27x27"
   "#484 @ 554,254: 21x20"
   "#485 @ 781,954: 13x29"
   "#486 @ 80,805: 14x25"
   "#487 @ 702,518: 27x16"
   "#488 @ 608,51: 12x10"
   "#489 @ 74,466: 23x13"
   "#490 @ 452,230: 23x20"
   "#491 @ 468,264: 11x10"
   "#492 @ 187,648: 25x25"
   "#493 @ 818,658: 14x16"
   "#494 @ 517,825: 10x22"
   "#495 @ 937,211: 10x11"
   "#496 @ 188,9: 28x19"
   "#497 @ 968,783: 23x24"
   "#498 @ 580,98: 11x16"
   "#499 @ 353,245: 18x12"
   "#500 @ 418,533: 13x26"
   "#501 @ 150,220: 18x20"
   "#502 @ 966,879: 16x11"
   "#503 @ 304,209: 10x22"
   "#504 @ 433,462: 11x13"
   "#505 @ 604,364: 10x15"
   "#506 @ 389,73: 20x15"
   "#507 @ 565,518: 14x22"
   "#508 @ 274,802: 12x16"
   "#509 @ 139,415: 11x16"
   "#510 @ 317,487: 18x16"
   "#511 @ 475,548: 22x23"
   "#512 @ 133,425: 15x8"
   "#513 @ 791,100: 17x14"
   "#514 @ 434,510: 18x20"
   "#515 @ 580,264: 26x21"
   "#516 @ 741,599: 19x20"
   "#517 @ 133,77: 18x20"
   "#518 @ 826,380: 29x18"
   "#519 @ 549,161: 25x22"
   "#520 @ 807,296: 26x17"
   "#521 @ 920,478: 29x15"
   "#522 @ 563,96: 18x24"
   "#523 @ 610,366: 17x14"
   "#524 @ 848,677: 23x16"
   "#525 @ 438,51: 10x12"
   "#526 @ 795,562: 22x20"
   "#527 @ 307,353: 24x13"
   "#528 @ 317,330: 23x28"
   "#529 @ 794,788: 10x14"
   "#530 @ 67,799: 16x23"
   "#531 @ 934,283: 27x15"
   "#532 @ 41,108: 21x14"
   "#533 @ 32,482: 13x21"
   "#534 @ 891,959: 19x14"
   "#535 @ 304,298: 17x12"
   "#536 @ 115,195: 16x22"
   "#537 @ 456,514: 19x12"
   "#538 @ 131,423: 22x19"
   "#539 @ 949,789: 10x17"
   "#540 @ 974,236: 24x24"
   "#541 @ 297,348: 24x16"
   "#542 @ 676,85: 22x11"
   "#543 @ 723,447: 13x13"
   "#544 @ 683,523: 10x14"
   "#545 @ 948,78: 25x22"
   "#546 @ 806,816: 20x29"
   "#547 @ 855,323: 19x12"
   "#548 @ 642,739: 14x23"
   "#549 @ 42,163: 23x24"
   "#550 @ 853,829: 25x23"
   "#551 @ 99,391: 28x23"
   "#552 @ 256,428: 10x17"
   "#553 @ 262,621: 16x12"
   "#554 @ 417,6: 11x29"
   "#555 @ 128,218: 11x15"
   "#556 @ 183,379: 10x11"
   "#557 @ 530,617: 12x27"
   "#558 @ 454,890: 20x23"
   "#559 @ 216,132: 26x18"
   "#560 @ 715,4: 12x29"
   "#561 @ 729,236: 14x19"
   "#562 @ 901,365: 12x20"
   "#563 @ 548,211: 29x19"
   "#564 @ 216,689: 12x5"
   "#565 @ 730,741: 13x23"
   "#566 @ 270,607: 16x24"
   "#567 @ 815,201: 28x23"
   "#568 @ 965,699: 16x17"
   "#569 @ 307,725: 22x10"
   "#570 @ 33,60: 14x16"
   "#571 @ 731,22: 12x26"
   "#572 @ 515,745: 15x18"
   "#573 @ 645,137: 19x11"
   "#574 @ 717,850: 17x25"
   "#575 @ 946,831: 26x11"
   "#576 @ 323,607: 25x20"
   "#577 @ 0,931: 20x21"
   "#578 @ 253,444: 24x21"
   "#579 @ 29,277: 15x14"
   "#580 @ 942,497: 17x20"
   "#581 @ 918,712: 22x13"
   "#582 @ 636,429: 22x12"
   "#583 @ 198,3: 29x21"
   "#584 @ 595,746: 18x17"
   "#585 @ 360,910: 29x21"
   "#586 @ 884,5: 12x26"
   "#587 @ 296,199: 23x15"
   "#588 @ 439,320: 17x14"
   "#589 @ 598,912: 13x19"
   "#590 @ 792,880: 13x11"
   "#591 @ 310,544: 17x16"
   "#592 @ 310,107: 10x17"
   "#593 @ 55,893: 12x23"
   "#594 @ 606,586: 29x21"
   "#595 @ 238,574: 23x16"
   "#596 @ 327,38: 25x24"
   "#597 @ 317,761: 28x18"
   "#598 @ 470,834: 21x19"
   "#599 @ 678,549: 19x24"
   "#600 @ 737,463: 11x16"
   "#601 @ 931,610: 24x13"
   "#602 @ 59,375: 24x15"
   "#603 @ 2,707: 11x28"
   "#604 @ 590,269: 25x12"
   "#605 @ 900,339: 23x17"
   "#606 @ 427,763: 29x10"
   "#607 @ 434,613: 18x15"
   "#608 @ 15,761: 21x24"
   "#609 @ 81,950: 25x24"
   "#610 @ 277,291: 26x10"
   "#611 @ 528,889: 26x22"
   "#612 @ 185,788: 11x21"
   "#613 @ 523,910: 28x29"
   "#614 @ 111,279: 27x19"
   "#615 @ 909,331: 4x19"
   "#616 @ 844,67: 28x20"
   "#617 @ 466,472: 28x19"
   "#618 @ 257,24: 20x14"
   "#619 @ 931,301: 17x12"
   "#620 @ 806,7: 20x15"
   "#621 @ 449,549: 29x14"
   "#622 @ 127,137: 16x14"
   "#623 @ 517,115: 13x22"
   "#624 @ 878,950: 14x19"
   "#625 @ 958,97: 11x27"
   "#626 @ 548,172: 11x27"
   "#627 @ 702,758: 14x15"
   "#628 @ 423,844: 21x14"
   "#629 @ 28,295: 14x21"
   "#630 @ 592,888: 21x12"
   "#631 @ 468,475: 21x24"
   "#632 @ 962,961: 20x23"
   "#633 @ 319,120: 21x18"
   "#634 @ 62,910: 10x18"
   "#635 @ 130,464: 14x23"
   "#636 @ 976,942: 21x11"
   "#637 @ 755,560: 10x22"
   "#638 @ 96,795: 27x24"
   "#639 @ 964,210: 11x22"
   "#640 @ 81,464: 13x17"
   "#641 @ 122,34: 18x22"
   "#642 @ 365,100: 18x25"
   "#643 @ 148,22: 22x16"
   "#644 @ 917,48: 14x28"
   "#645 @ 638,251: 9x6"
   "#646 @ 236,272: 28x23"
   "#647 @ 939,132: 16x12"
   "#648 @ 424,138: 23x21"
   "#649 @ 508,359: 3x8"
   "#650 @ 592,594: 19x24"
   "#651 @ 491,5: 17x24"
   "#652 @ 123,543: 22x14"
   "#653 @ 543,227: 17x25"
   "#654 @ 35,266: 13x19"
   "#655 @ 648,60: 12x14"
   "#656 @ 359,25: 13x27"
   "#657 @ 531,547: 29x23"
   "#658 @ 11,903: 13x17"
   "#659 @ 972,284: 16x16"
   "#660 @ 427,310: 22x24"
   "#661 @ 466,248: 19x28"
   "#662 @ 365,112: 14x18"
   "#663 @ 603,584: 24x11"
   "#664 @ 515,624: 11x12"
   "#665 @ 190,590: 20x25"
   "#666 @ 673,770: 28x25"
   "#667 @ 187,902: 11x28"
   "#668 @ 320,356: 10x15"
   "#669 @ 152,222: 8x7"
   "#670 @ 498,752: 15x26"
   "#671 @ 779,691: 25x20"
   "#672 @ 650,412: 29x10"
   "#673 @ 816,18: 11x24"
   "#674 @ 195,2: 11x13"
   "#675 @ 604,55: 12x10"
   "#676 @ 330,430: 28x25"
   "#677 @ 340,43: 27x15"
   "#678 @ 506,351: 28x20"
   "#679 @ 422,924: 21x13"
   "#680 @ 550,41: 27x21"
   "#681 @ 909,232: 14x21"
   "#682 @ 873,498: 21x29"
   "#683 @ 606,363: 13x18"
   "#684 @ 588,606: 11x22"
   "#685 @ 461,296: 12x17"
   "#686 @ 23,875: 10x27"
   "#687 @ 159,321: 12x10"
   "#688 @ 3,131: 15x23"
   "#689 @ 475,264: 16x14"
   "#690 @ 704,315: 21x18"
   "#691 @ 735,319: 13x27"
   "#692 @ 826,24: 11x22"
   "#693 @ 555,200: 26x21"
   "#694 @ 440,314: 14x11"
   "#695 @ 116,109: 28x10"
   "#696 @ 169,800: 17x16"
   "#697 @ 20,887: 15x27"
   "#698 @ 13,143: 27x20"
   "#699 @ 712,7: 24x27"
   "#700 @ 519,619: 21x12"
   "#701 @ 680,170: 16x19"
   "#702 @ 127,159: 27x29"
   "#703 @ 100,306: 11x24"
   "#704 @ 19,825: 18x10"
   "#705 @ 600,232: 21x24"
   "#706 @ 480,16: 12x20"
   "#707 @ 277,863: 22x19"
   "#708 @ 693,324: 22x17"
   "#709 @ 419,49: 22x16"
   "#710 @ 397,285: 24x25"
   "#711 @ 11,104: 16x19"
   "#712 @ 77,516: 18x19"
   "#713 @ 936,726: 19x22"
   "#714 @ 843,474: 11x16"
   "#715 @ 557,313: 22x23"
   "#716 @ 965,954: 20x18"
   "#717 @ 123,832: 14x23"
   "#718 @ 107,68: 17x29"
   "#719 @ 194,23: 21x26"
   "#720 @ 514,42: 23x16"
   "#721 @ 831,717: 25x13"
   "#722 @ 848,788: 11x21"
   "#723 @ 538,792: 16x19"
   "#724 @ 845,296: 26x23"
   "#725 @ 29,46: 12x26"
   "#726 @ 463,265: 23x17"
   "#727 @ 653,48: 29x26"
   "#728 @ 302,275: 21x19"
   "#729 @ 89,211: 20x13"
   "#730 @ 683,709: 21x22"
   "#731 @ 523,50: 19x25"
   "#732 @ 599,110: 25x26"
   "#733 @ 500,123: 29x24"
   "#734 @ 54,805: 28x28"
   "#735 @ 953,696: 28x22"
   "#736 @ 78,659: 17x24"
   "#737 @ 485,481: 13x28"
   "#738 @ 423,50: 23x23"
   "#739 @ 56,655: 29x13"
   "#740 @ 671,529: 11x21"
   "#741 @ 321,369: 13x14"
   "#742 @ 515,859: 18x17"
   "#743 @ 778,687: 24x19"
   "#744 @ 445,712: 14x11"
   "#745 @ 683,499: 21x27"
   "#746 @ 95,392: 25x29"
   "#747 @ 340,25: 19x14"
   "#748 @ 92,799: 14x12"
   "#749 @ 294,964: 14x29"
   "#750 @ 344,282: 19x25"
   "#751 @ 906,671: 26x22"
   "#752 @ 639,673: 15x26"
   "#753 @ 565,207: 25x12"
   "#754 @ 923,110: 28x27"
   "#755 @ 574,524: 21x14"
   "#756 @ 170,241: 27x20"
   "#757 @ 123,32: 17x17"
   "#758 @ 611,926: 26x26"
   "#759 @ 804,306: 25x18"
   "#760 @ 729,104: 16x12"
   "#761 @ 513,331: 21x19"
   "#762 @ 169,640: 12x20"
   "#763 @ 549,842: 26x12"
   "#764 @ 940,807: 21x28"
   "#765 @ 182,970: 11x17"
   "#766 @ 793,34: 11x17"
   "#767 @ 732,849: 12x12"
   "#768 @ 19,918: 21x20"
   "#769 @ 928,787: 17x23"
   "#770 @ 824,374: 28x22"
   "#771 @ 821,174: 18x14"
   "#772 @ 774,799: 24x25"
   "#773 @ 375,231: 29x20"
   "#774 @ 225,725: 16x26"
   "#775 @ 404,613: 10x14"
   "#776 @ 855,535: 15x11"
   "#777 @ 337,460: 29x22"
   "#778 @ 446,17: 27x24"
   "#779 @ 39,644: 21x28"
   "#780 @ 854,114: 26x16"
   "#781 @ 275,596: 19x10"
   "#782 @ 920,164: 21x22"
   "#783 @ 326,663: 22x27"
   "#784 @ 36,765: 19x17"
   "#785 @ 811,310: 20x12"
   "#786 @ 883,815: 13x14"
   "#787 @ 251,182: 11x17"
   "#788 @ 565,32: 20x14"
   "#789 @ 122,354: 19x16"
   "#790 @ 946,432: 19x19"
   "#791 @ 164,630: 23x23"
   "#792 @ 953,790: 20x26"
   "#793 @ 911,756: 10x26"
   "#794 @ 908,655: 27x27"
   "#795 @ 75,305: 11x17"
   "#796 @ 491,614: 26x26"
   "#797 @ 902,495: 23x21"
   "#798 @ 164,644: 19x28"
   "#799 @ 467,308: 27x11"
   "#800 @ 407,7: 29x16"
   "#801 @ 920,207: 14x22"
   "#802 @ 579,10: 10x21"
   "#803 @ 442,300: 29x17"
   "#804 @ 933,369: 17x25"
   "#805 @ 98,69: 24x25"
   "#806 @ 607,951: 23x19"
   "#807 @ 33,896: 26x14"
   "#808 @ 648,664: 12x27"
   "#809 @ 962,783: 16x20"
   "#810 @ 589,731: 16x27"
   "#811 @ 137,975: 13x14"
   "#812 @ 94,534: 13x16"
   "#813 @ 758,461: 12x12"
   "#814 @ 645,649: 27x16"
   "#815 @ 102,549: 24x13"
   "#816 @ 677,440: 19x17"
   "#817 @ 932,621: 28x27"
   "#818 @ 293,980: 19x11"
   "#819 @ 35,727: 14x21"
   "#820 @ 807,6: 14x12"
   "#821 @ 714,380: 25x27"
   "#822 @ 252,578: 12x11"
   "#823 @ 20,898: 13x10"
   "#824 @ 540,303: 19x19"
   "#825 @ 358,556: 8x3"
   "#826 @ 816,650: 15x24"
   "#827 @ 484,222: 15x15"
   "#828 @ 314,409: 21x29"
   "#829 @ 107,193: 27x18"
   "#830 @ 774,614: 23x28"
   "#831 @ 620,309: 12x16"
   "#832 @ 846,550: 24x27"
   "#833 @ 775,451: 15x23"
   "#834 @ 129,429: 20x18"
   "#835 @ 411,832: 14x28"
   "#836 @ 832,186: 26x18"
   "#837 @ 101,567: 18x23"
   "#838 @ 837,462: 26x25"
   "#839 @ 720,544: 26x28"
   "#840 @ 84,157: 29x26"
   "#841 @ 363,259: 24x23"
   "#842 @ 261,604: 16x21"
   "#843 @ 131,818: 16x28"
   "#844 @ 635,249: 16x15"
   "#845 @ 435,630: 26x11"
   "#846 @ 732,324: 29x28"
   "#847 @ 336,677: 27x24"
   "#848 @ 209,780: 23x17"
   "#849 @ 169,377: 21x13"
   "#850 @ 62,190: 24x20"
   "#851 @ 821,208: 27x19"
   "#852 @ 923,666: 16x25"
   "#853 @ 948,605: 6x4"
   "#854 @ 252,573: 20x13"
   "#855 @ 174,169: 20x23"
   "#856 @ 209,574: 26x24"
   "#857 @ 191,144: 15x21"
   "#858 @ 829,657: 16x24"
   "#859 @ 766,704: 14x25"
   "#860 @ 175,260: 15x28"
   "#861 @ 589,887: 16x13"
   "#862 @ 8,569: 23x16"
   "#863 @ 817,5: 11x19"
   "#864 @ 394,729: 27x29"
   "#865 @ 347,893: 18x21"
   "#866 @ 893,14: 19x18"
   "#867 @ 1,754: 10x29"
   "#868 @ 635,606: 29x17"
   "#869 @ 489,950: 20x23"
   "#870 @ 371,146: 19x29"
   "#871 @ 264,431: 18x29"
   "#872 @ 506,260: 17x26"
   "#873 @ 24,896: 11x25"
   "#874 @ 317,557: 13x11"
   "#875 @ 83,252: 18x22"
   "#876 @ 105,964: 21x18"
   "#877 @ 174,528: 28x11"
   "#878 @ 385,597: 26x15"
   "#879 @ 557,84: 20x21"
   "#880 @ 232,179: 27x11"
   "#881 @ 234,49: 29x25"
   "#882 @ 471,973: 25x23"
   "#883 @ 513,871: 29x25"
   "#884 @ 819,224: 17x11"
   "#885 @ 462,970: 17x18"
   "#886 @ 38,761: 20x28"
   "#887 @ 510,702: 14x17"
   "#888 @ 638,786: 29x14"
   "#889 @ 643,147: 29x27"
   "#890 @ 909,221: 28x25"
   "#891 @ 342,927: 17x21"
   "#892 @ 635,839: 17x29"
   "#893 @ 686,210: 24x16"
   "#894 @ 671,80: 20x21"
   "#895 @ 148,943: 13x24"
   "#896 @ 627,887: 28x20"
   "#897 @ 811,191: 28x15"
   "#898 @ 477,368: 28x27"
   "#899 @ 841,110: 17x14"
   "#900 @ 296,210: 10x29"
   "#901 @ 843,85: 14x13"
   "#902 @ 408,362: 25x29"
   "#903 @ 80,295: 22x12"
   "#904 @ 462,962: 23x26"
   "#905 @ 755,834: 23x23"
   "#906 @ 665,516: 21x13"
   "#907 @ 564,64: 19x12"
   "#908 @ 215,226: 11x28"
   "#909 @ 149,631: 16x27"
   "#910 @ 536,421: 29x13"
   "#911 @ 739,864: 18x21"
   "#912 @ 537,866: 19x26"
   "#913 @ 614,570: 15x22"
   "#914 @ 150,18: 29x28"
   "#915 @ 693,763: 15x26"
   "#916 @ 503,160: 18x23"
   "#917 @ 426,547: 27x29"
   "#918 @ 351,694: 15x21"
   "#919 @ 50,532: 10x13"
   "#920 @ 702,26: 11x27"
   "#921 @ 134,201: 22x10"
   "#922 @ 224,704: 24x11"
   "#923 @ 70,795: 18x13"
   "#924 @ 99,310: 14x28"
   "#925 @ 4,897: 13x25"
   "#926 @ 657,664: 21x23"
   "#927 @ 632,731: 15x19"
   "#928 @ 396,732: 10x17"
   "#929 @ 167,971: 25x12"
   "#930 @ 972,256: 19x11"
   "#931 @ 689,568: 12x14"
   "#932 @ 64,156: 23x15"
   "#933 @ 854,705: 26x11"
   "#934 @ 101,201: 11x21"
   "#935 @ 469,52: 10x20"
   "#936 @ 642,723: 10x25"
   "#937 @ 822,463: 23x29"
   "#938 @ 393,715: 15x27"
   "#939 @ 818,666: 26x14"
   "#940 @ 143,585: 25x17"
   "#941 @ 351,103: 13x28"
   "#942 @ 551,175: 17x25"
   "#943 @ 744,817: 28x24"
   "#944 @ 652,342: 14x23"
   "#945 @ 272,451: 17x28"
   "#946 @ 546,422: 16x10"
   "#947 @ 116,50: 15x15"
   "#948 @ 790,940: 11x29"
   "#949 @ 843,90: 19x14"
   "#950 @ 962,415: 28x22"
   "#951 @ 405,854: 28x22"
   "#952 @ 341,426: 21x15"
   "#953 @ 351,116: 17x22"
   "#954 @ 509,695: 13x19"
   "#955 @ 258,344: 26x25"
   "#956 @ 306,746: 24x27"
   "#957 @ 371,308: 14x17"
   "#958 @ 31,103: 13x12"
   "#959 @ 361,948: 16x20"
   "#960 @ 866,8: 23x11"
   "#961 @ 66,673: 29x28"
   "#962 @ 296,878: 18x15"
   "#963 @ 470,633: 14x18"
   "#964 @ 724,361: 24x23"
   "#965 @ 662,604: 29x28"
   "#966 @ 607,902: 25x19"
   "#967 @ 242,728: 18x25"
   "#968 @ 878,267: 21x19"
   "#969 @ 762,921: 19x27"
   "#970 @ 795,27: 12x23"
   "#971 @ 254,123: 17x21"
   "#972 @ 157,975: 29x24"
   "#973 @ 52,174: 26x19"
   "#974 @ 142,388: 29x25"
   "#975 @ 36,57: 19x15"
   "#976 @ 392,576: 17x22"
   "#977 @ 787,560: 16x24"
   "#978 @ 548,496: 27x23"
   "#979 @ 764,387: 23x29"
   "#980 @ 934,469: 16x16"
   "#981 @ 12,68: 26x17"
   "#982 @ 189,645: 11x20"
   "#983 @ 459,467: 17x17"
   "#984 @ 72,267: 29x12"
   "#985 @ 77,454: 25x21"
   "#986 @ 613,572: 19x29"
   "#987 @ 265,338: 25x16"
   "#988 @ 550,896: 28x16"
   "#989 @ 215,170: 21x28"
   "#990 @ 467,284: 20x27"
   "#991 @ 38,269: 29x14"
   "#992 @ 439,34: 28x17"
   "#993 @ 955,885: 29x14"
   "#994 @ 126,399: 17x19"
   "#995 @ 630,682: 14x12"
   "#996 @ 116,277: 14x23"
   "#997 @ 421,378: 27x18"
   "#998 @ 825,296: 26x12"
   "#999 @ 243,461: 10x23"
   "#1000 @ 142,117: 15x28"
   "#1001 @ 187,361: 18x10"
   "#1002 @ 632,858: 10x20"
   "#1003 @ 250,407: 26x23"
   "#1004 @ 923,741: 12x14"
   "#1005 @ 44,542: 21x11"
   "#1006 @ 977,706: 21x13"
   "#1007 @ 451,370: 17x25"
   "#1008 @ 98,211: 22x10"
   "#1009 @ 629,445: 10x12"
   "#1010 @ 691,481: 26x10"
   "#1011 @ 850,788: 17x24"
   "#1012 @ 302,284: 28x25"
   "#1013 @ 764,532: 24x21"
   "#1014 @ 13,784: 16x27"
   "#1015 @ 904,392: 19x21"
   "#1016 @ 720,324: 23x24"
   "#1017 @ 738,244: 28x24"
   "#1018 @ 808,389: 26x24"
   "#1019 @ 279,179: 18x27"
   "#1020 @ 171,752: 14x23"
   "#1021 @ 542,216: 29x17"
   "#1022 @ 338,366: 14x15"
   "#1023 @ 666,627: 20x21"
   "#1024 @ 149,37: 10x11"
   "#1025 @ 711,624: 18x22"
   "#1026 @ 787,635: 20x18"
   "#1027 @ 649,611: 16x22"
   "#1028 @ 523,815: 23x13"
   "#1029 @ 561,850: 27x14"
   "#1030 @ 221,436: 15x27"
   "#1031 @ 179,344: 18x13"
   "#1032 @ 54,47: 24x14"
   "#1033 @ 717,8: 28x13"
   "#1034 @ 534,411: 25x14"
   "#1035 @ 685,660: 14x16"
   "#1036 @ 944,489: 19x22"
   "#1037 @ 95,169: 18x13"
   "#1038 @ 325,424: 18x13"
   "#1039 @ 303,465: 10x15"
   "#1040 @ 65,857: 25x29"
   "#1041 @ 434,757: 21x26"
   "#1042 @ 298,179: 18x12"
   "#1043 @ 323,209: 17x22"
   "#1044 @ 665,168: 18x17"
   "#1045 @ 212,781: 17x23"
   "#1046 @ 466,92: 21x29"
   "#1047 @ 847,473: 17x19"
   "#1048 @ 11,144: 25x17"
   "#1049 @ 247,575: 26x13"
   "#1050 @ 744,815: 18x11"
   "#1051 @ 439,116: 15x29"
   "#1052 @ 800,890: 19x19"
   "#1053 @ 98,5: 11x20"
   "#1054 @ 87,543: 14x21"
   "#1055 @ 255,277: 29x16"
   "#1056 @ 585,231: 19x25"
   "#1057 @ 530,934: 21x24"
   "#1058 @ 879,113: 19x22"
   "#1059 @ 210,786: 25x19"
   "#1060 @ 316,478: 19x20"
   "#1061 @ 889,509: 23x10"
   "#1062 @ 130,105: 27x26"
   "#1063 @ 606,565: 22x16"
   "#1064 @ 456,54: 18x20"
   "#1065 @ 523,588: 15x25"
   "#1066 @ 536,170: 11x10"
   "#1067 @ 842,244: 28x10"
   "#1068 @ 133,31: 24x15"
   "#1069 @ 126,115: 18x26"
   "#1070 @ 164,37: 13x24"
   "#1071 @ 36,757: 18x21"
   "#1072 @ 417,219: 25x20"
   "#1073 @ 65,257: 29x20"
   "#1074 @ 74,421: 13x18"
   "#1075 @ 669,579: 29x26"
   "#1076 @ 252,711: 13x20"
   "#1077 @ 97,362: 14x26"
   "#1078 @ 108,973: 23x25"
   "#1079 @ 951,124: 14x12"
   "#1080 @ 907,681: 18x29"
   "#1081 @ 707,267: 13x16"
   "#1082 @ 402,936: 19x24"
   "#1083 @ 756,706: 16x29"
   "#1084 @ 632,299: 14x16"
   "#1085 @ 864,820: 27x17"
   "#1086 @ 825,75: 10x22"
   "#1087 @ 564,158: 28x21"
   "#1088 @ 52,48: 21x16"
   "#1089 @ 243,341: 18x22"
   "#1090 @ 469,517: 23x12"
   "#1091 @ 392,75: 13x23"
   "#1092 @ 147,586: 13x21"
   "#1093 @ 423,924: 14x24"
   "#1094 @ 772,637: 23x25"
   "#1095 @ 608,737: 26x28"
   "#1096 @ 546,403: 26x29"
   "#1097 @ 86,550: 13x13"
   "#1098 @ 196,501: 24x13"
   "#1099 @ 208,739: 22x24"
   "#1100 @ 714,307: 25x13"
   "#1101 @ 348,341: 26x12"
   "#1102 @ 932,489: 10x17"
   "#1103 @ 107,182: 15x20"
   "#1104 @ 693,147: 19x28"
   "#1105 @ 720,832: 18x25"
   "#1106 @ 866,101: 16x18"
   "#1107 @ 352,921: 24x20"
   "#1108 @ 392,869: 18x10"
   "#1109 @ 92,173: 15x25"
   "#1110 @ 135,459: 11x19"
   "#1111 @ 954,413: 22x29"
   "#1112 @ 848,872: 27x17"
   "#1113 @ 470,538: 28x10"
   "#1114 @ 761,446: 10x16"
   "#1115 @ 482,666: 23x28"
   "#1116 @ 21,203: 17x16"
   "#1117 @ 179,955: 29x26"
   "#1118 @ 587,757: 23x27"
   "#1119 @ 765,529: 19x13"
   "#1120 @ 261,596: 20x13"
   "#1121 @ 320,625: 10x24"
   "#1122 @ 394,299: 10x12"
   "#1123 @ 577,320: 27x28"
   "#1124 @ 539,259: 20x23"
   "#1125 @ 296,263: 20x24"
   "#1126 @ 596,596: 19x14"
   "#1127 @ 847,426: 25x28"
   "#1128 @ 82,171: 11x22"
   "#1129 @ 547,887: 10x22"
   "#1130 @ 415,638: 18x20"
   "#1131 @ 627,40: 26x29"
   "#1132 @ 132,209: 12x19"
   "#1133 @ 137,349: 12x26"
   "#1134 @ 860,516: 12x29"
   "#1135 @ 224,432: 21x23"
   "#1136 @ 617,725: 11x14"
   "#1137 @ 677,675: 13x18"
   "#1138 @ 613,929: 20x15"
   "#1139 @ 819,832: 27x25"
   "#1140 @ 828,173: 27x23"
   "#1141 @ 664,418: 15x27"
   "#1142 @ 141,115: 26x22"
   "#1143 @ 167,219: 22x20"
   "#1144 @ 907,71: 18x29"
   "#1145 @ 454,578: 15x18"
   "#1146 @ 729,309: 13x23"
   "#1147 @ 833,711: 24x14"
   "#1148 @ 731,357: 11x21"
   "#1149 @ 598,607: 24x26"
   "#1150 @ 563,891: 14x23"
   "#1151 @ 292,219: 10x22"
   "#1152 @ 976,670: 11x13"
   "#1153 @ 153,503: 22x12"
   "#1154 @ 687,526: 24x13"
   "#1155 @ 929,296: 11x26"
   "#1156 @ 270,174: 26x18"
   "#1157 @ 962,204: 27x25"
   "#1158 @ 839,261: 10x17"
   "#1159 @ 19,47: 15x28"
   "#1160 @ 302,215: 21x16"
   "#1161 @ 301,319: 22x21"
   "#1162 @ 721,456: 13x19"
   "#1163 @ 437,896: 21x25"
   "#1164 @ 723,215: 25x22"
   "#1165 @ 407,219: 14x18"
   "#1166 @ 196,646: 15x24"
   "#1167 @ 570,204: 29x25"
   "#1168 @ 725,62: 10x15"
   "#1169 @ 316,645: 20x29"
   "#1170 @ 721,91: 23x18"
   "#1171 @ 365,830: 18x19"
   "#1172 @ 264,644: 29x28"
   "#1173 @ 357,427: 20x18"
   "#1174 @ 453,553: 27x28"
   "#1175 @ 701,174: 17x27"
   "#1176 @ 668,658: 21x11"
   "#1177 @ 109,355: 10x16"
   "#1178 @ 442,356: 19x15"
   "#1179 @ 913,59: 12x14"
   "#1180 @ 908,89: 20x24"
   "#1181 @ 431,13: 26x19"
   "#1182 @ 953,817: 17x15"
   "#1183 @ 292,856: 12x27"
   "#1184 @ 185,351: 14x26"
   "#1185 @ 443,504: 20x26"
   "#1186 @ 427,638: 18x11"
   "#1187 @ 257,480: 17x20"
   "#1188 @ 43,256: 25x24"
   "#1189 @ 249,461: 19x22"
   "#1190 @ 875,472: 24x16"
   "#1191 @ 197,896: 26x28"
   "#1192 @ 707,264: 18x12"
   "#1193 @ 34,140: 20x17"
   "#1194 @ 843,235: 13x29"
   "#1195 @ 765,840: 9x10"
   "#1196 @ 288,242: 11x16"
   "#1197 @ 962,979: 27x17"
   "#1198 @ 885,956: 11x25"
   "#1199 @ 175,500: 21x29"
   "#1200 @ 724,74: 22x15"
   "#1201 @ 528,913: 16x19"
   "#1202 @ 786,117: 14x22"
   "#1203 @ 629,619: 20x11"
   "#1204 @ 366,734: 18x28"
   "#1205 @ 592,569: 10x24"
   "#1206 @ 519,31: 13x15"
   "#1207 @ 561,54: 11x18"
   "#1208 @ 93,327: 20x17"
   "#1209 @ 220,711: 29x12"
   "#1210 @ 343,287: 11x15"
   "#1211 @ 942,665: 21x10"
   "#1212 @ 357,559: 17x22"
   "#1213 @ 180,966: 26x26"
   "#1214 @ 721,24: 29x20"
   "#1215 @ 941,288: 13x13"
   "#1216 @ 178,884: 21x19"
   "#1217 @ 214,687: 17x10"
   "#1218 @ 304,316: 14x26"
   "#1219 @ 321,4: 14x22"
   "#1220 @ 21,601: 11x12"
   "#1221 @ 621,301: 26x29"
   "#1222 @ 882,475: 17x27"
   "#1223 @ 131,107: 15x11"
   "#1224 @ 373,559: 12x17"
   "#1225 @ 271,602: 13x28"
   "#1226 @ 189,969: 20x21"
   "#1227 @ 960,67: 15x18"
   "#1228 @ 736,742: 24x21"
   "#1229 @ 252,622: 28x10"
   "#1230 @ 237,139: 22x17"
   "#1231 @ 698,314: 13x17"
   "#1232 @ 1,582: 10x19"
   "#1233 @ 699,634: 24x13"
   "#1234 @ 561,225: 21x19"
   "#1235 @ 747,563: 28x11"
   "#1236 @ 240,446: 22x24"
   "#1237 @ 59,764: 14x14"
   "#1238 @ 523,985: 20x14"
   "#1239 @ 438,898: 27x11"
   "#1240 @ 13,296: 18x19"
   "#1241 @ 177,751: 13x19"
   "#1242 @ 648,667: 21x19"
   "#1243 @ 358,364: 20x23"
   "#1244 @ 929,127: 5x6"
   "#1245 @ 664,114: 22x25"
   "#1246 @ 668,930: 11x13"
   "#1247 @ 13,317: 28x26"
   "#1248 @ 590,363: 19x24"
   "#1249 @ 481,239: 22x28"
   "#1250 @ 145,24: 22x24"
   "#1251 @ 101,147: 28x19"
   "#1252 @ 506,743: 21x19"
   "#1253 @ 273,796: 20x22"
   "#1254 @ 683,485: 11x20"
   "#1255 @ 468,244: 13x13"
   "#1256 @ 613,689: 26x16"
   "#1257 @ 912,935: 23x21"
   "#1258 @ 670,818: 10x16"
   "#1259 @ 269,35: 14x15"
   "#1260 @ 971,213: 17x18"
   "#1261 @ 480,539: 23x20"
   "#1262 @ 209,427: 17x16"
   "#1263 @ 526,987: 12x9"
   "#1264 @ 447,104: 28x17"
   "#1265 @ 526,333: 28x23"
   "#1266 @ 554,169: 11x11"
   "#1267 @ 902,379: 23x26"
   "#1268 @ 843,461: 26x22"
   "#1269 @ 911,327: 18x12"
   "#1270 @ 154,664: 25x18"
   "#1271 @ 319,17: 19x29"
   "#1272 @ 556,499: 14x11"
   "#1273 @ 134,911: 13x12"
   "#1274 @ 378,88: 14x15"
   "#1275 @ 134,161: 11x17"
   "#1276 @ 857,175: 23x24"
   "#1277 @ 546,56: 26x26"
   "#1278 @ 954,439: 17x28"
   "#1279 @ 278,128: 14x17"
   "#1280 @ 539,363: 17x18"
   "#1281 @ 27,744: 16x16"
   "#1282 @ 695,314: 25x25"
   "#1283 @ 975,678: 10x26"
   "#1284 @ 179,637: 23x29"
   "#1285 @ 108,65: 17x13"
   "#1286 @ 266,439: 13x17"
   "#1287 @ 469,57: 13x17"
   "#1288 @ 82,821: 16x15"
   "#1289 @ 577,717: 15x28"
   "#1290 @ 618,961: 19x22"
   "#1291 @ 477,159: 27x10"
   "#1292 @ 731,427: 15x24"
   "#1293 @ 39,335: 14x26"
   "#1294 @ 657,926: 16x27"
   "#1295 @ 142,956: 24x22"
   "#1296 @ 615,510: 12x11"
   "#1297 @ 402,869: 23x25"
   "#1298 @ 918,764: 16x14"
   "#1299 @ 829,667: 18x15"
   "#1300 @ 946,538: 13x27"
   "#1301 @ 889,936: 24x27"
   "#1302 @ 985,510: 11x21"
   "#1303 @ 191,710: 14x22"
   "#1304 @ 472,649: 12x17"
   "#1305 @ 833,71: 25x14"
   "#1306 @ 693,253: 20x23"
   "#1307 @ 921,744: 12x16"
   "#1308 @ 852,301: 14x19"
   "#1309 @ 654,593: 11x14"
   "#1310 @ 633,389: 15x28"
   "#1311 @ 860,229: 18x18"
   "#1312 @ 938,820: 27x15"
   "#1313 @ 118,797: 23x20"
   "#1314 @ 429,361: 17x23"
   "#1315 @ 566,357: 16x25"
   "#1316 @ 694,193: 16x22"
   "#1317 @ 181,772: 17x26"
   "#1318 @ 190,182: 26x16"
   "#1319 @ 193,358: 11x19"
   "#1320 @ 79,304: 18x19"
   "#1321 @ 242,622: 27x18"
   "#1322 @ 533,373: 16x23"
   "#1323 @ 589,764: 14x16"])

(def cloth-dimensions
  {:width 1000
   :height 1000})

(defn parse-int [s]
  (Integer. s))

(defn parse-claim [c]
  (let [[_ id h-margin v-margin w h]
        (first (re-seq #"#(\d+) @ (\d+)\,(\d+)\: (\d+)x(\d+)" c))]
    {:id (parse-int id)
     :h-margin (parse-int h-margin)
     :v-margin (parse-int v-margin)
     :width (parse-int w)
     :height (parse-int h)}))

(def parsed-claims (map parse-claim claims))

(defn overlaps [claims]
  (reduce (fn [m {:keys [width height h-margin v-margin]}]
            (->> (for [w (range h-margin (+ h-margin width))
                       h (range v-margin (+ v-margin height))]
                   [w h])
                 (reduce (fn [m position]
                           (update-in m position (fnil inc 0)))
                         m)))
          {}
          claims))

(defn number-overlapping-claims [claims]
  (->> (overlaps claims)
       (mapcat val)
       (map second)
       (filter #(<= 2 %))
       count))

(defn overlaps-with? [c1 c2]
  (let [x11 (:h-margin c1)
        x12 (+ (:h-margin c1) (:width c1))
        x21 (:h-margin c2)
        x22 (+ (:h-margin c2) (:width c2))
        y11 (:v-margin c1)
        y12 (+ (:v-margin c1) (:height c1))
        y21 (:v-margin c2)
        y22 (+ (:v-margin c2) (:height c2))]
    (and (not (or (<= x12 x21)
                  (<= x22 x11)))
         (not (or (<= y12 y21)
                  (<= y22 y11))))))


(defn any-overlaps? [claims c]
  (->> claims
       (filter #(not= (:id %) (:id c)))
       (some (partial overlaps-with? c))))


(comment
  (number-overlapping-claims parsed-claims)
  ; 109785
  (->> parsed-claims
       (remove (partial any-overlaps? parsed-claims))
       first
       :id)
  ; 504
  )