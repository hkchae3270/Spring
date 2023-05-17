package com.multi.weka02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import weka.classifiers.Evaluation;
import weka.classifiers.trees.RandomForest;
import weka.core.Instances;

public class WekaTest_titanic_1 {

	public static void main(String[] args) throws Exception {
		// 1. 데이터 로딩(수집)
		Instances data = new Instances(new BufferedReader(new FileReader("data/titanic2_pre.arff")));
		// System.out.println(data);

		Instances train = data.trainCV(5, 0, new Random(100));
		Instances test = data.testCV(5, 0);

		// 2. 데이터 전처리(weka나 엑셀, 메모장)
		// 3. 분석 방법을 제시
		RandomForest model = new RandomForest();

		//target지정
		train.setClassIndex(train.numAttributes() - 1); 
		test.setClassIndex(test.numAttributes() - 1);
		
		// 4. 교차검증(Cross-Validation)설정
		Evaluation eval = new Evaluation(train);
		eval.crossValidateModel(model, train, 5, new Random(100));

		// 5. 분석을 시작 --> 제일 좋은 공식을 찾아냈을 것임.
		model.buildClassifier(train);
		
		// 6. 찾아낸 방법(모델)을 통해 test로 검증해보자.
		eval.evaluateModel(model, test);
		
		// 7. 검증한 결과를 출력
		System.out.println(eval.toSummaryString());
		System.out.println(eval.toMatrixString());
	}
}
