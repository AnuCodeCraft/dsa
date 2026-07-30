class MedianFinder {
    private PriorityQueue<Integer> lowerhalf;
    private PriorityQueue<Integer> upperhalf;

    public MedianFinder() {
        lowerhalf = new PriorityQueue<>(Collections.reverseOrder());
        upperhalf = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (lowerhalf.isEmpty() || lowerhalf.peek() >= num) {
            lowerhalf.offer(num);
        } else {
            upperhalf.offer(num);
        }

        if (lowerhalf.size() > upperhalf.size() + 1) {
            upperhalf.offer(lowerhalf.poll());
        } else if (upperhalf.size() > lowerhalf.size()) {
            lowerhalf.offer(upperhalf.poll());
        }
    }

    public double findMedian() {
        if (lowerhalf.size() > upperhalf.size()) {
            return lowerhalf.peek();
        }
        return (lowerhalf.peek() + upperhalf.peek()) / 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
