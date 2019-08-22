package fr.polielio.project2;


public enum UpdateType
{

    MIN_01(60000L),
    SEC(1000L),
    FAST(500L),
    FASTER(250L),
    ULTRAFAST(1L);

    private long _time;
    private long _last;
    private long _timeSpent;
    private long _timeCount;

    private UpdateType(long time)
    {
        _time = time;
        _last = System.currentTimeMillis();
    }

    public boolean Elapsed()
    {
        if (elapsed(_last, _time))
        {
            _last = System.currentTimeMillis();
            return true;
        }

        return false;
    }

    public void StartTime()
    {
        _timeCount = System.currentTimeMillis();
    }

    public void StopTime()
    {
        _timeSpent += System.currentTimeMillis() - _timeCount;
    }

    public static boolean elapsed(long from, long required)
    {
        return System.currentTimeMillis() - from > required;
    }
}
