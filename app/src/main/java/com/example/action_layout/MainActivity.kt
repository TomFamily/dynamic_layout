package com.example.action_layout

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginLeft
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

//        创建容器(MainActivity顶层继承于context）
//        addLinearLayout()
//        addRelativeLayout()
        addConstraintLayout()

    }
//    添加ConstraintLayout布局
@SuppressLint("ResourceAsColor")
fun addConstraintLayout(){
        val ykConstraintLayout = ConstraintLayout(this).also {
            it.layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,ConstraintLayout.LayoutParams.MATCH_PARENT)
            it.background = getDrawable(R.color.red)
            it.id = R.id.ykContainer
            setContentView(it)
        }
     ImageView(this).also {
         it.layoutParams = ConstraintLayout.LayoutParams(dpToPx(110),dpToPx(110)).also {
             it.leftToLeft = R.id.ykContainer
             it.leftMargin = dpToPx(10)
             it.topMargin = dpToPx(10)
             it.topToTop = R.id.ykContainer
         }
         it.id = R.id.ykImageView
         it.background = getDrawable(R.color.black)
         it.setImageResource(R.mipmap.yk1)
         it.scaleType = ImageView.ScaleType.CENTER_CROP
         ykConstraintLayout.addView(it)
     }
     TextView(this).also {
        it.layoutParams = ConstraintLayout.LayoutParams(dpToPx(250),dpToPx(110)).also {
            it.leftToRight = R.id.ykImageView
            it.topToTop = R.id.ykContainer
//            it.rightToRight = R.id.ykContainer
            it.topMargin = dpToPx(10)
            it.leftMargin = dpToPx(10)
        }
         it.id = R.id.ykTextView1
        it.background = getDrawable(R.color.red2)
         it.text = "官媒披露姜国文案细节：下属前台“揽活”，他在幕后“办事”"
         it.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
         it.setTextColor(R.color.white)
         it.textSize = 20f
        ykConstraintLayout.addView(it)
     }
    TextView(this).also {
        it.layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,dpToPx(600)).also {
            it.topToBottom = R.id.ykImageView
            it.leftMargin = dpToPx(10)
            it.topMargin = dpToPx(10)
            it.rightMargin = dpToPx(10)
            it.rightToRight = R.id.ykContainer
        }
        it.text = "中纪委机关报最新消息披露，被指“毫无信仰、政治投机”、 “破明规矩、行潜规则”的黑龙江省哈尔滨市政协原党组书记、主席姜国文曾违规处理的70起案件和线索。消息还披露，姜国文在幕后“办事”，前台“揽活”的正是哈尔滨市纪委原常委刘杰。\n" +
                "\n" +
                "《中国纪检监察报》8月3日报道提到，黑龙江省纪委监委以纪检监察干部严重违纪违法案件为反面典型，在全省纪检监察系统开展大规模专题警示教育：痛定思痛，深刻汲取案件教训；持续加大队伍整肃力度，坚决清除“害群之马”；建立整改长效机制，持续深化巩固专题警示教育成果。在深刻反思、检视问题、整改落实中，直面问题，刀刃向内。\n" +
                "\n" +
                "报道称，深挖细查，对黑龙江省哈尔滨市政协原党组书记、主席姜国文等案涉及的党员干部特别是纪检监察干部违纪违法问题，一个也不放过；全面起底，对姜国文违规处理的70起案件和线索进行逐一梳理……\n" +
                "\n" +
                "报道还提到，姜国文，党的十九大后黑龙江省首个被查处的省部级领导干部。他长期担任哈尔滨市纪委书记，执纪违纪，肆意将党和人民赋予的监督执纪权当作拉拢关系、加官晋爵、纳贿敛财的工具，纵贪护贪、滥权妄为。"
        it.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        it.setTextColor(R.color.white)
        it.textSize = 15f
//        it.background = getDrawable(R.color.black)
        ykConstraintLayout.addView(it)
    }
    }

//    手动设置LinearLayout的布局
@SuppressLint("ResourceAsColor")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun addLinearLayout(){
        var container = LinearLayout(this).also {
            it.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT)
            it.orientation = LinearLayout.VERTICAL
            it.background = getDrawable(R.color.colorPrimary)
//            将布局加到容器上
            setContentView(it)
        }
//    创建LinearLayout子控件
     LinearLayout(this).also {
        it.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,dpToPx(110))
        it.orientation = LinearLayout.HORIZONTAL
        it.background = getDrawable(R.color.colorPrimaryDark)
//            将布局加到容器上
        container.addView(it)
     }.apply {
         ImageView(this@MainActivity).also {
             it.layoutParams = LinearLayout.LayoutParams(dpToPx(110),LinearLayout.LayoutParams.MATCH_PARENT)
             it.background = getDrawable(R.color.red)
             it.setImageResource(R.mipmap.yk1)
             it.scaleType = ImageView.ScaleType.CENTER_CROP
             this.addView(it)
         }
         TextView(this@MainActivity).also {
             it.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT)
                     .also { it.setMargins(dpToPx(10),dpToPx(15),dpToPx(10),dpToPx(10)) }
//             it.background = getDrawable(R.color.colorAccent)
             it.text = "官媒披露姜国文案细节：下属前台“揽活”，他在幕后“办事”"
             it.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
             it.setTextColor(R.color.red)
             it.textSize = 20f

             this.addView(it)
         }
     }
    TextView(this).also{
        it.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT)
                .also { it.setMargins(dpToPx(10),dpToPx(10),dpToPx(10),dpToPx(10)) }
        it.background = getDrawable(R.color.colorPrimary)
        it.text = "中纪委机关报最新消息披露，被指“毫无信仰、政治投机”、 “破明规矩、行潜规则”的黑龙江省哈尔滨市政协原党组书记、主席姜国文曾违规处理的70起案件和线索。消息还披露，姜国文在幕后“办事”，前台“揽活”的正是哈尔滨市纪委原常委刘杰。\n" +
                "\n" +
                "《中国纪检监察报》8月3日报道提到，黑龙江省纪委监委以纪检监察干部严重违纪违法案件为反面典型，在全省纪检监察系统开展大规模专题警示教育：痛定思痛，深刻汲取案件教训；持续加大队伍整肃力度，坚决清除“害群之马”；建立整改长效机制，持续深化巩固专题警示教育成果。在深刻反思、检视问题、整改落实中，直面问题，刀刃向内。\n" +
                "\n" +
                "报道称，深挖细查，对黑龙江省哈尔滨市政协原党组书记、主席姜国文等案涉及的党员干部特别是纪检监察干部违纪违法问题，一个也不放过；全面起底，对姜国文违规处理的70起案件和线索进行逐一梳理……\n" +
                "\n" +
                "报道还提到，姜国文，党的十九大后黑龙江省首个被查处的省部级领导干部。他长期担任哈尔滨市纪委书记，执纪违纪，肆意将党和人民赋予的监督执纪权当作拉拢关系、加官晋爵、纳贿敛财的工具，纵贪护贪、滥权妄为。"
        it.textSize = 15f
        it.setTextColor(R.color.red)
        container.addView(it)
    }
    }

//    设置RelativeLatyout
@RequiresApi(Build.VERSION_CODES.M)
@SuppressLint("ResourceAsColor")
fun addRelativeLayout(){
    val RContainer = RelativeLayout(this).also {
        it.layoutParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT)
        it.background = getDrawable(R.color.red)
        it.id = R.id.ykContainer
        setContentView(it)
    }

    ImageView(this).also {
        it.layoutParams = RelativeLayout.LayoutParams(dpToPx(110),dpToPx(110)).also {
            it.setMargins(dpToPx(10),dpToPx(10),0,0)
        }
        it.scaleType = ImageView.ScaleType.CENTER_CROP
        it.setImageResource(R.mipmap.yk1)
        it.id = R.id.ykImageView
        RContainer.addView(it)
    }

    TextView(this).also {
        it.layoutParams = RelativeLayout.LayoutParams(0,0).also {
//            设置与其他控件的相对关系
            it.addRule(RelativeLayout.RIGHT_OF,R.id.ykImageView)
            it.rightMargin = dpToPx(10)
            it.leftMargin = dpToPx(10)
            it.addRule(RelativeLayout.ALIGN_PARENT_END,R.id.ykContainer)
            it.addRule(RelativeLayout.ALIGN_TOP,R.id.ykImageView)
            it.addRule(RelativeLayout.ALIGN_BOTTOM,R.id.ykImageView)
        }
        it.background = getDrawable(R.color.red2)
        it.text = "官媒披露姜国文案细节：下属前台“揽活”，他在幕后“办事”"
        it.setTextColor(getColor(R.color.white))
        it.textSize = 20f
        it.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        it.id = R.id.ykTextView1
        RContainer.addView(it)
    }

    TextView(this).also {
        it.layoutParams = RelativeLayout.LayoutParams(0,0).also {
            it.addRule(RelativeLayout.ALIGN_PARENT_LEFT,R.id.ykContainer)
            it.addRule(RelativeLayout.ALIGN_TOP,R.id.ykImageView)
            it.setMargins(dpToPx(10),dpToPx(120),dpToPx(10),dpToPx(10))
            it.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,R.id.ykContainer)
            it.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,R.id.ykContainer)
        }
        it.text = "中纪委机关报最新消息披露，被指“毫无信仰、政治投机”、 “破明规矩、行潜规则”的黑龙江省哈尔滨市政协原党组书记、主席姜国文曾违规处理的70起案件和线索。消息还披露，姜国文在幕后“办事”，前台“揽活”的正是哈尔滨市纪委原常委刘杰。\n" +
                "\n" +
                "《中国纪检监察报》8月3日报道提到，黑龙江省纪委监委以纪检监察干部严重违纪违法案件为反面典型，在全省纪检监察系统开展大规模专题警示教育：痛定思痛，深刻汲取案件教训；持续加大队伍整肃力度，坚决清除“害群之马”；建立整改长效机制，持续深化巩固专题警示教育成果。在深刻反思、检视问题、整改落实中，直面问题，刀刃向内。\n" +
                "\n" +
                "报道称，深挖细查，对黑龙江省哈尔滨市政协原党组书记、主席姜国文等案涉及的党员干部特别是纪检监察干部违纪违法问题，一个也不放过；全面起底，对姜国文违规处理的70起案件和线索进行逐一梳理……\n" +
                "\n" +
                "报道还提到，姜国文，党的十九大后黑龙江省首个被查处的省部级领导干部。他长期担任哈尔滨市纪委书记，执纪违纪，肆意将党和人民赋予的监督执纪权当作拉拢关系、加官晋爵、纳贿敛财的工具，纵贪护贪、滥权妄为。"
        it.textSize = 15f
        it.setTextColor(getColor(R.color.white))
        RContainer.addView(it)
    }


}



//    获取屏幕密度
    fun dpToPx(dp : Int): Int{
        return (dp * resources.displayMetrics.density).toInt()
    }

}
