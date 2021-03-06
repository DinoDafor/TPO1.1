
import com.company.Graph;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void testGraph() {
        Graph g = new Graph(8);
        int[][] array;
        array = new int[][]{{1, 3, 4}, {2, 3, 5, 6}, {0,6}, {7}, {2, 6, 7}, {3}, {4, 5}, {5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                g.addEdge(i, array[i][j]);
            }
        }
        assertEquals("0 1 2 0v 6 4 2v 6v 7 5 3 7v 6v 5v 3v 5v 6v 3v 4v", g.depthFirstSearch(0));

    }
    @Test
    void testAnotherOrderGraph() {
        Graph g = new Graph(8);
        int[][] array;
        array = new int[][]{{4, 3, 1}, {2, 5, 6, 3}, {0,6}, {7}, {2, 7, 6}, {3}, {4, 5}, {6, 5}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                g.addEdge(i, array[i][j]);
            }
        }
        assertEquals("0 4 2 0v 6 4v 5 3 7 6v 5v 7v 6v 3v 1 2v 5v 6v 3v", g.depthFirstSearch(0));

    }
    @Test
    void testCycleGraph() {
        Graph g = new Graph(8);
        int[][] array;
        array = new int[][]{{0,1, 3, 4}, {2, 3, 5, 6}, {0,6}, {7}, {2, 6, 7}, {3}, {4, 5}, {5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                g.addEdge(i, array[i][j]);
            }
        }
        assertEquals("0 0v 1 2 0v 6 4 2v 6v 7 5 3 7v 6v 5v 3v 5v 6v 3v 4v", g.depthFirstSearch(0));

    }

    @Test
    void testNegativeDstGraph() {
        Graph g = new Graph(8);
        int[][] array;
        array = new int[][]{{-1, 3, 4}, {2, 3, 5, 6}, {0,6}, {7}, {2, 6, 7}, {3}, {4, 5}, {5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                g.addEdge(i, array[i][j]);
            }
        }
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> g.depthFirstSearch(0));
    }
    @Test
    void testOutOfBoundsDstGraph() {
        Graph g = new Graph(8);
        int[][] array;
        array = new int[][]{{8, 3, 4}, {2, 3, 5, 6}, {0,6}, {7}, {2, 6, 7}, {3}, {4, 5}, {5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                g.addEdge(i, array[i][j]);
            }
        }
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> g.depthFirstSearch(0));
    }




}