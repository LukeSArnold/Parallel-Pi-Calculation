import javax.xml.transform.Result;
import java.util.Date;
public class Assign3 {
	public static void main(String[] args) {
		TaskQueue queue = new TaskQueue();
		ResultTable table = new ResultTable();
		Date currentDate = new Date();
		long startTime = currentDate.getTime();
		for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++){
			Worker worker = new Worker(table,queue);
			worker.start();
		}


		if (queue.isEmpty()) {
			System.out.print("\n3.");
			for (int i = 1; i < 1001; i++) {
				System.out.print(table.getValue(i));
				if (i%100 == 0){
					System.out.println("");
				}

			}
			Date newDate = new Date();
			long finishTime = newDate.getTime();
			long totalTime = finishTime - startTime;
			System.out.println("\nTook "+totalTime+" milliseconds");

		}


	}
}
