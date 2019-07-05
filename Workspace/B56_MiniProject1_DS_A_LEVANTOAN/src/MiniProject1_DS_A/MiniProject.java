package MiniProject1_DS_A;

import java.io.BufferedReader;
import java.io.FileReader;

public class MiniProject {
	int cnt = 0;
	int m;
	int n;
	boolean conflict[][];
	static boolean teach[][];
	int x[];

	public int xh[][];
	String data[];

	public void solve() {

		readData("data.txt");
		m = Integer.parseInt(data[0].split(" ")[0]);
		n = Integer.parseInt(data[0].split(" ")[1]);

		x = new int[n + 1];
		conflict = new boolean[n + 1][n + 1];
		teach = new boolean[m + 1][n + 1];
		xh = new int[m + 1][n + 1];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				teach[i][j] = false;
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				conflict[i][j] = true;
			}
		}

		for (int i = 1; i <= m; i++) {
			String [] t = data[i].split(" ");
			for (int j = 1; j <= t.length-1; j++) {
				teach[i][Integer.parseInt(t[j])] = true;
			}
		}
		int k;
		k = Integer.parseInt(data[m + 1]);

		for (int i = m + 2; i < m + 2 + k; i++) {
			int a = Integer.parseInt(data[i].split(" ")[0]);
			int b = Integer.parseInt(data[i].split(" ")[1]);
			conflict[a][b] = false;
			conflict[b][a]=false;

		}
		
		TRY(1);
	}

	private void TRY(int k) {
		// TODO Auto-generated method stub
		int v;
		for (v = 1; v <= m; v++) {
			if (check(v, k)) {
				   x[k] = v;
				xh[v][k] = k;
				
				if (k == n)
				
					solution();
				else{
					TRY(k + 1);
					xh[v][k] = 0;
				}
			}
		}
	}

	private void solution() {
		cnt++;
		System.out.print("solution " + cnt + " th: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println(" ");
	}

	private boolean check(int v, int k) {
		// TODO Auto-generated method stub
		boolean check = true;
		if (k == 1)
			check = true;
		else {
			for (int i = 1; i < k; i++) {
				if ((xh[v][i] == i)) {
					check = check && conflict[k][xh[v][i]];
				}
			}
		}
		return (check && teach[v][k]);

	}

	public void readData(String fileName) {
		data = new String[100];
		try {
			FileReader file= new FileReader(fileName);
			BufferedReader in = new BufferedReader(file);
			int i = 0;
			while ((data[i++]=in.readLine()) != null) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		MiniProject miniProject = new MiniProject();
		miniProject.solve();

	}

}
