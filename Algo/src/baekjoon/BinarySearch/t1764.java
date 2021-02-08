package baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class t1764 {
	static int noli; // 듣지못한사람
	static int nosee; // 보지못한사람

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		noli = Integer.parseInt(st.nextToken());
		nosee = Integer.parseInt(st.nextToken());

		List<String> li = new ArrayList<>();
		List<String> see = new ArrayList<String>();
		List<String> nolisee = new ArrayList<String>();
		// 못들은사람, 못본사람 각각 나눠서 List 배열에 넣고
		// contains 일때마다 count 를 증가시키자
//		System.out.println("noli+nosee " + (noli + nosee));

		for (int i = 0; i < noli + nosee; i++) {
			if (i < noli) {
				li.add(br.readLine());
//				System.out.println("nolisten | " + br.readLine() + i);
			} else {
				see.add(br.readLine());
//				System.out.println("nosee  |  " + br.readLine() + i);
			}
		}
		Collections.sort(li);
		Collections.sort(see);

		if (noli > nosee) {
			for (int p = 0; p < noli; p++) {
				if (li.contains(see.get(p))) {
					nolisee.add(see.get(p));
//					System.out.println(see.get(p));
				}
			}
		} else {
			for (int q = 0; q < noli; q++) {
				if (see.contains(li.get(q))) {
					nolisee.add(li.get(q));
//					System.out.println(li.get(q));
				}
			}
		}
		System.out.println(nolisee.size());
		for (int z = 0; z < nolisee.size(); z++) {
			System.out.println(nolisee.get(z));
		}
	}
}
