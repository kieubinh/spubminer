import org.jdmp.core.algorithm.classification.bayes.NaiveBayesClassifier;
import org.jdmp.core.algorithm.clustering.SelfOrganizingMap;
import org.jdmp.core.dataset.DataSet;
import org.jdmp.core.dataset.ListDataSet;

/**
 * Created by kieubinh on 23-May-17.
 */


public class Test {
    public static void main(String[] args) throws Exception {
            // load example data set
//        ListDataSet dataSet = DataSet.Factory.IRIS();
//
//        // create a classifier
//        NaiveBayesClassifier classifier = new NaiveBayesClassifier();
//
//        // train the classifier using all data
//        classifier.trainAll(dataSet);
//
//        // use the classifier to make predictions
//        classifier.predictAll(dataSet);
//
//        // get the results
//        double accuracy = dataSet.getAccuracy();
//
//        System.out.println("accuracy: " + accuracy);

        // load example data set
        ListDataSet dataSet = DataSet.Factory.ANIMALS();
        ListDataSet dataTest = DataSet.Factory.MNISTTest();

        // create a self-organizing map
        SelfOrganizingMap som = new SelfOrganizingMap();

        // train the SOM using all data
        som.train(dataSet);

        // use the SOM to make predictions
        som.predict(dataTest);

        // display dataset on the screen
        //dataSet.showGUI();
        System.out.println(dataTest.getAccuracy());
    }
}