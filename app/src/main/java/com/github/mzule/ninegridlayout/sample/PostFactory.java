package com.github.mzule.ninegridlayout.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CaoDongping on 5/12/16.
 */
public class PostFactory {
    private static final String CONTENT = "在孩子的世界里，风是可以画出来的...很多现代绘画大师最终的梦想就是成为一个孩子，画儿童画——因为儿童会用最童真的视角来描绘自己的世界，即使不“像”，但是很准确。六一即将来临，张小江有奖征集儿童画，赶紧给你家宝宝投稿吧！\n" +
            "http://ww3.sinaimg.cn/orj480/aa1d0c12gw1f3sco5s6dbj21kw24nkdd.jpg|249|335\n" +
            "\n" +
            "豆友大島的广播：内心戏很足 说的就是我\n" +
            "http://ww2.sinaimg.cn/thumb180/61ca8acdgw1f3b8l8dn21j20b408waah.jpg\n" +
            "http://ww1.sinaimg.cn/thumb180/61ca8acdgw1f3b8l8g71sj20b408wjrv.jpg\n" +
            "http://ww4.sinaimg.cn/thumb180/61ca8acdgw1f3b8l8f4qaj20b408w3yv.jpg\n" +
            "http://ww3.sinaimg.cn/thumb180/61ca8acdgw1f3b8l8k2kkj20b408w74u.jpg\n" +
            "http://ww2.sinaimg.cn/thumb180/61ca8acdgw1f3b8l8fsg6j20b408wdgb.jpg\n" +
            "http://ww1.sinaimg.cn/thumb180/61ca8acdgw1f3b8l8f5wbj20b408waaj.jpg\n" +
            "http://ww2.sinaimg.cn/thumb180/61ca8acdgw1f3b8l8qz29j20b408wdgc.jpg\n" +
            "http://ww1.sinaimg.cn/thumb180/61ca8acdgw1f3b8l8rhi0j20b408wdg9.jpg\n" +
            "http://ww4.sinaimg.cn/thumb180/61ca8acdgw1f3b8l8qyy4j20b408wgm1.jpg\n" +
            "\n" +
            "很喜欢这样的环境\n" +
            "http://ww1.sinaimg.cn/orj480/4e6aa894gw1f2onfggxpej20zk0qo7aw.jpg|480|360\n" +
            "\n" +
            "一个简单的图片点赞效果demo：O网页链接，像Ins那样。参考泡网的文章单独写出来的demo。个人感觉可用的范围挺大的，现在图片社交那么多。可以自定义双击点赞啊，在RecycleItem中集成啊[嘻嘻]@泡在网上编代码 @大侠咕咚\n" +
            "http://ww1.sinaimg.cn/thumb180/006dXScfjw1f1yjc2pp9qg308j0ejwfc.gif\n" +
            "http://ww3.sinaimg.cn/thumb180/006dXScfjw1f1yjc3c9ntg308j0ejgmk.gif\n" +
            "http://ww1.sinaimg.cn/thumb180/006dXScfjw1f1yjc3vntag308j0ej757.gif\n" +
            "\n" +
            "收到啦收到啦[噢耶][噢耶]谢谢流利说，我会努力认真做任务学英语哒，还有谢谢之前给我点赞的小伙伴们，么么哒[亲亲]！\n" +
            "http://ww2.sinaimg.cn/orj480/75cb21bdgw1f3rpt7bchpj20qo0zkwij.jpg|480|640\n" +
            "\n" +
            "分享我公众号上的一篇文章：《美丽的卷积云》，欢迎关注\n" +
            "http://ww3.sinaimg.cn/orj480/599e230bjw1f3sioi9akbj20ja0ixtax.jpg\n" +
            "http://ww1.sinaimg.cn/orj480/599e230bjw1f3sipho7xjj20ke0h7n0m.jpg\n" +
            "\n" +
            "夏天到了……[太阳][微风]\n" +
            "http://ww3.sinaimg.cn/orj480/6853040fjw1f3sh97lhl5j20qo0zkwxa.jpg\n" +
            "http://ww4.sinaimg.cn/thumb180/6853040fjw1f3sh98xghwj20qo0zkawl.jpg\n" +
            "http://ww4.sinaimg.cn/thumb180/6853040fjw1f3sh9a6wyij20qo0zk7nx.jpg\n" +
            "http://ww4.sinaimg.cn/thumb180/6853040fjw1f3sh9bh4d2j20qo0zkwm0.jpg\n" +
            "\n" +
            "Let my soul smile through my heart and my heart smile through my eyes, that I may scatter rich smiles in sad hearts.让我的灵魂通过我的心脏微笑，我的心脏通过我的眼睛微笑，在我悲伤的心中绽放笑容。\n" +
            "http://ww1.sinaimg.cn/orj480/ad673c42gw1f3se3q7c2xj21kw0zk10c.jpg|398|249\n" +
            "\n" +
            "#IT技术分享#【《深入理解Java虚拟机》笔记】本文作者分享了学习《深入理解Java虚拟机》的总结笔记。[给力]全文：O《深入理解Java虚拟机》笔记_慕课文章 希望对学习Java的朋友们有所帮助。\n" +
            "http://ww3.sinaimg.cn/orj480/c5131475jw1f3smwxjdkkj20ci07tta4.jpg|399|249\n" +
            "\n" +
            "英国花园有什么独到之处？已有 2828 人关注：O网页链接（想看更多？下载知乎 App：S知乎 ）\n" +
            "http://ww3.sinaimg.cn/orj480/718878b5jw1f3sf531h9qj20qo0k0dp1.jpg|332|249\n" +
            "\n" +
            "旅居巴西的美国插画家Rosha在异国当起了英语老师，不忍看到学生背成语时痛苦的样子，他利用自己的专业优势把这些难懂的成语俚语画了出来，当英语俚语变成萌萌的插画，既好记又好玩，学英语也变成了a piece of cake啦！\n" +
            "http://ww2.sinaimg.cn/thumb180/ad673c42gw1f3skqr4z2ej20dw0dwjsb.jpg\n" +
            "http://ww4.sinaimg.cn/thumb180/ad673c42gw1f3skqrq2tbj20dw0dwjsc.jpg\n" +
            "http://ww1.sinaimg.cn/thumb180/ad673c42gw1f3skqsap9sj20dw0dwgmm.jpg\n" +
            "http://ww4.sinaimg.cn/thumb180/ad673c42gw1f3skqssptfj20dw0dwt9b.jpg\n" +
            "http://ww3.sinaimg.cn/thumb180/ad673c42gw1f3skqtkkqdj20dw0dwt9f.jpg\n" +
            "http://ww3.sinaimg.cn/thumb180/ad673c42gw1f3skque87ej20dw0dwaam.jpg\n" +
            "http://ww1.sinaimg.cn/thumb180/ad673c42gw1f3skquxanrj20dw0dwt9p.jpg\n" +
            "http://ww3.sinaimg.cn/thumb180/ad673c42gw1f3skqvh2k3j20dw0dwgm9.jpg\n" +
            "http://ww1.sinaimg.cn/thumb180/ad673c42gw1f3skqw48yej20dw0dw3zd.jpg\n" +
            "\n" +
            "#溢于颜表# 一个人的旅行也要时刻聆听你的温柔，人生有时很长有时很短，一路有你就不孤单。 #华为G9青春版# 双MIC降噪远方的声音犹在耳畔，享受我们的清新时光。\n" +
            "http://ww2.sinaimg.cn/orj480/6d9f761bjw1f3sdmt1uuij20sg18gjvm.jpg|480|750\n" +
            "\n" +
            "【战略咨询项目和管理咨询项目的主要区别是什么？对顾问的技能要求有什么不同？】何明科：战略咨询是管理咨询的一个真子集，而且是皇冠上的明珠。只是随着管理知识的普及以及技术的发展，皇冠稍许褪色而且明珠也在黯淡…所以对于从事不同类型的咨询业务的顾问来说，所擅长的技巧也不同…\n" +
            "http://ww1.sinaimg.cn/orj480/718878b5jw1f3sfbnubodj20qo0fugon.jpg|419|249\n" +
            "\n" +
            "分享一个十分不要脸的霍建华\n" +
            "http://ww4.sinaimg.cn/orj480/736f0c7ejw1f3rj2vzdtjj20nk0dcgmz.jpg|636|360\n" +
            "\n" +
            "#幕星周刊广告部# 一起吃个宵夜吧\n" +
            "http://ww4.sinaimg.cn/thumb180/4d8b0b03gw1f3rp51vt1jj20i22u0wy1.jpg\n" +
            "http://ww4.sinaimg.cn/thumb180/4d8b0b03gw1f3rp5cs6wyj20i23k0nos.jpg\n" +
            "http://ww1.sinaimg.cn/thumb180/4d8b0b03gw1f3rp5gtixyj20i244dwwg.jpg\n" +
            "\n" +
            "【月入不到4万5 别说自己是中产[衰]】报告显示，中国内地自认为是中产的家庭月收入为45202元(约6858美元)。中国内地中产认为，要实现长期经济保障，存款需要达到770万元，而平均资产达到1240万元才能算富裕。他们当中62%的人没有退休计划，他们认为约需1110万元才可安享退休生活。\n" +
            "http://ww2.sinaimg.cn/orj480/630bea00jw1f3reejijaqj2096064t8o.jpg|330|220\n" +
            "\n" +
            "【《欢乐颂》安迪原型——硅谷最有名女大佬，十亿级女富豪】据说《欢乐颂》里刘涛演的美女高管安迪学的是就是她，她是硅谷最有名女大佬，全世界最有名的十亿级女富豪，扎克伯格当年为了挖她，连续6周约她一起吃晚饭谈心。她就是Facebook首席运营官桑德伯格。\n" +
            "http://ww2.sinaimg.cn/orj480/83c73248jw1f3rjkcltv9j20c86vnkjl.jpg|249|830\n" +
            "\n" +
            "【实用面积71平米㎡混搭两居室】造价：约20万，设计师打破户型原有格局，客厅整体以粉绿为主调，令空间视野更开阔。\n" +
            "http://ww2.sinaimg.cn/thumb180/84fe43edjw1es6hlhy9xjj20c80ag3zg.jpg\n" +
            "http://ww3.sinaimg.cn/thumb180/84fe43edjw1es6hlis7ufj20c8085756.jpg\n" +
            "http://ww4.sinaimg.cn/thumb180/84fe43edjw1es6hlj4f9yj20c808575e.jpg\n" +
            "http://ww3.sinaimg.cn/thumb180/84fe43edjw1es6hljq0vpj20c8085752.jpg\n" +
            "http://ww3.sinaimg.cn/thumb180/84fe43edjw1es6hlk5751j20c8085ab2.jpg\n" +
            "http://ww4.sinaimg.cn/thumb180/84fe43edjw1es6hlkbol8j20c80hj40k.jpg\n" +
            "http://ww2.sinaimg.cn/thumb180/84fe43edjw1es6hlkmhxbj20c807nq3l.jpg\n" +
            "http://ww2.sinaimg.cn/thumb180/84fe43edjw1es6hll1zg8j20c8085wfc.jpg\n" +
            "http://ww3.sinaimg.cn/thumb180/84fe43edjw1es6hll689uj20c80hj76n.jpg\n" +
            "\n" +
            "一张图带你了解！ 今日10点京东首发预售，由1MORE与MISFIT时尚携手；日本音频协会Hi-Res Audio认证；格莱美奖音乐大师定调；磁吸式设计，轻轻一吸即可化身时尚装饰链。今年初更被CES媒体誉为“炫黑科技” :  O网页链接 ，【转发抽三条1MORE时尚胶囊圈铁耳机】\n" +
            "http://ww4.sinaimg.cn/orj480/97ea4b2bgw1f3r7bp4fl0j20u06sgb2b.jpg|249|332\n" +
            "\n" +
            "我是女超人，每天睡4小时拍4本刊！\n" +
            "http://ww2.sinaimg.cn/orj480/5222c3f4jw1f3sk30gj1rj20ku0pmn0i.jpg|249|249\n" +
            "\n" +
            "【深度】KPI 来源于工业化的年代，而在 IT 崛起的时代，工作的价值往往不在于工作量和勤奋程度，而在于员工的创造力以及一些方法论的东西。 在这种情况下，继续去苛求量化方法，或者强求去制定一些标准，往往产生南辕北辙，与目标相反的结果。本文作者36氪特邀撰稿人曹政。\n" +
            "http://tc.sinaimg.cn/maxwidth.2048/tc.service.weibo.com/a_36krcnd_com/82882b66a0883ce083a9d107b53d7e90.jpg|360|210\n" +
            "\n" +
            "#极限挑战# 从前从前，有四个像花一样美的男子，据说，人们管他们叫#极限F4#，意为FLOWER 4\n" +
            "http://ww3.sinaimg.cn/orj480/0066RNZIgw1f3ryc9792tj313c1n4txi.jpg\n" +
            "http://ww3.sinaimg.cn/orj480/0066RNZIgw1f3ryce4b4mj31kw11u7ho.jpg\n" +
            "http://ww3.sinaimg.cn/thumb180/0066RNZIgw1f3rycj9de0j31kw2dj1kx.jpg\n" +
            "http://ww4.sinaimg.cn/thumb180/0066RNZIgw1f3rycrcuacj31kw11uwt8.jpg\n" +
            "http://ww3.sinaimg.cn/thumb180/0066RNZIgw1f3rycqq16zj31kw11uaqx.jpg";

    public static List<Post> fake() {
        List<Post> result = new ArrayList<>();
        String[] every = CONTENT.split("\\n\\n");
        for (String single : every) {
            String[] raw = single.split("\\n");
            Post post = new Post();
            post.setMsg(raw[0]);
            post.setImages(new ArrayList<Post.Image>());
            for (int i = 1; i < raw.length; i++) {
                Post.Image image = new Post.Image();
                if (raw.length == 2) {
                    String[] uwh = raw[i].split("\\|");
                    image.setUrl(uwh[0]);
                    image.setWidth(Integer.parseInt(uwh[1]) * 2);
                    image.setHeight(Integer.parseInt(uwh[2]) * 2);
                } else {
                    image.setUrl(raw[i]);
                }
                post.getImages().add(image);
            }
            result.add(post);
        }
        return result;
    }
}
