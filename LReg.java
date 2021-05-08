package org.dl;

import java.util.Arrays;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class LReg {
	public static void main(String args[]) throws Exception {
		//DataSource src=new DataSource("C:\\Users\\dell\\eclipse-workspace\\org.dl\\src\\main\\java\\org\\dl\\clean_data.arff");
		DataSource src1=new DataSource("C:\\Users\\dell\\eclipse-workspace\\org.dl\\src\\main\\java\\org\\dl\\test_data.arff");
		
		//Instances ds=src.getDataSet();
		//ds.setClassIndex(ds.numAttributes()-1);
		//LinearRegression lr=new LinearRegression();
		//lr.buildClassifier(ds);
		
		
		Instances ds1=src1.getDataSet();
		ds1.setClassIndex(ds1.numAttributes()-1);
		LinearRegression lr1=new LinearRegression();
		lr1.buildClassifier(ds1);
		
		Evaluation lr_eval=new Evaluation(ds1);
		lr_eval.evaluateModel(lr1, ds1);
		System.out.println(lr_eval.toSummaryString());
		 
		
		Classifier classifier = new weka.classifiers.functions.LinearRegression();
		classifier.buildClassifier(ds1);
		
		System.out.println("-------------------");
		Instance predicationDataSet = ds1.get(2);
		double value = classifier.classifyInstance(predicationDataSet);
		
		System.out.println("Predicted label:");
		System.out.print(value);

		}
}
