import parser.DataParser
import utilities.Constant
import utilities.Converter

fun main() {
    val converter=Converter()
    val apps = DataParser(Constant.FILE_NAME,converter).getAllApps()
    val analyzer = Analyzer(converter)


    println("1# How many apps were developed by Google in the dataset? "+
            "\n${analyzer.findNumberOfAppsByCompanyName(apps,"Google")}")
    println("--------------------------------------------")
    println("2# What is the percentage of Medical apps?" +
            "\n%${analyzer.getPercentageOfCategory(apps,"Medical")}")
    println("--------------------------------------------")
    println("3# What is the oldest app in the dataset." +
            "\n${analyzer.findOldestApp(apps)?.appName}")
    println("--------------------------------------------")
    println("4# What is the percentage of apps running on android 9 and up only?"+
            "\n%${analyzer.getPercentageAppsRunningOnSpecificVersion(apps,9.0)}")
    println("--------------------------------------------")
    println("5# What are the largest 10 apps in the dataset?\n" +
            "${analyzer.getLargestApp(apps,10)}")
    println("--------------------------------------------")
    println("6# What are the top 10 installed apps.\n" +
            "${analyzer.topNAppInstall(apps,10)}")
    println("7# What is the largest app size developed by Meta Platforms Inc.? \n" +
            "${analyzer.getLargestAppsSizeByCompanyName(apps,"Meta Platforms Inc",1)}")

}